package br.com.munif.treinamento.unicesumar.voucher.config;

import br.com.munif.framework.vicente.core.VicThreadScope;
import br.com.munif.framework.vicente.security.api.VicRequestFilter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.munif.framework.vicente.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author munif
 */
@Configuration
public class WebConfiguration implements WebApplicationInitializer, WebMvcConfigurer {

	@Autowired
	private TokenService tokenService;

	@Bean
	public VicRequestFilter vicRequestFilter() {
		return new VicRequestFilter(tokenService) {
			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {
				// TODO Auto-generated method stub

				super.preHandle(request, response, handler);

				VicThreadScope.gi.set("SEED");
				VicThreadScope.ui.set("SEED");
				VicThreadScope.oi.set("SEED.");

				return true;
			}

		};
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(vicRequestFilter());
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowCredentials(true).allowedHeaders("*").allowedMethods("*");
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(jacksonConverter());
	}

	private MappingJackson2HttpMessageConverter jacksonConverter() {
		ObjectMapper mapper = new ObjectMapper();
		Hibernate5Module hm = new Hibernate5Module();
		hm.disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);
		mapper.registerModule(hm);
		mapper.registerModule(new JavaTimeModule());
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		mapper.setDateFormat(new ISO8601DateFormat());
//        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
		mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		MappingJackson2HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		jacksonConverter.setObjectMapper(mapper);
		return jacksonConverter;
	}

}
