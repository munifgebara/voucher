package br.com.munif.treinamento.unicesumar.voucher.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.munif.framework.vicente.application.VicRepositoryImpl;

@Configuration
@ComponentScan(basePackages = { "br.com.munif.treinamento.unicesumar.voucher",
		"br.com.munif.framework.vicente.application.victenancyfields", "br.com.munif.framework.vicente.api.errors",
		"br.com.munif.framework.vicente.security" })
@EnableAutoConfiguration()
@EntityScan(basePackages = { "br.com.munif.framework.vicente.domain",
		"br.com.munif.treinamento.unicesumar.voucher.entidades", "br.com.munif.framework.vicente.security" })
@EnableJpaRepositories(basePackages = { "br.com.munif.treinamento.unicesumar.voucher",
		"br.com.munif.framework.vicente.application.victenancyfields",
		"br.com.munif.framework.vicente.security.repository" }, repositoryBaseClass = VicRepositoryImpl.class)
@EnableTransactionManagement

public class DatabaseConfiguration {

	public DatabaseConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
