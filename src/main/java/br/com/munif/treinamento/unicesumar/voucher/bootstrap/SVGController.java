package br.com.munif.treinamento.unicesumar.voucher.bootstrap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.munif.framework.vicente.domain.entities.EntitiesToSVG;

@RestController
public class SVGController {
	

    @ResponseBody
    @RequestMapping(value = "/svg", produces = "image/svg+xml")
    public String svg() {
        return EntitiesToSVG.gera();

    }
    @ResponseBody
    @RequestMapping(value = "/svg2", produces = "image/svg+xml")
    public String sv2g() {
        return SpringClassesToSvg.gera();

    }

}
