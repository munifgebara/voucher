package br.com.munif.treinamento.unicesumar.voucher.bootstrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.munif.framework.vicente.core.RightsHelper;
import br.com.munif.framework.vicente.core.VicThreadScope;
import br.com.munif.framework.vicente.security.seed.SeedSecurity;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Aluno;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Polo;
import br.com.munif.treinamento.unicesumar.voucher.repositorios.*;


@Component
public class Seed implements ApplicationListener<ContextRefreshedEvent> {

	private Logger log = LogManager.getLogger(Seed.class);

	@Autowired
	private SeedSecurity seedSecurity;

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private PoloRepository poloRepository;
	
	@Autowired
	private ConcursoRepository concursoRepository;


	@Autowired
	private CampanhaVoucherRepository campanhaVoucherRepository;
	
	@Autowired
	private VoucherRepository voucherRepository;
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		VicThreadScope.gi.set("SEED");
		VicThreadScope.ui.set("SEED");
		VicThreadScope.oi.set("SEED.");
		VicThreadScope.ip.set("127.0.0.1");
		VicThreadScope.defaultRights
				.set(RightsHelper.OWNER_ALL + RightsHelper.GROUP_READ_UPDATE + RightsHelper.OTHER_READ);
		log.info("Start");
		seedSecurity.seedSecurity();

		seedAluno();

	}

	private void seedAluno() {
		Aluno aluno1 = alunoRepository.save(new Aluno("1", "Fulano", "123456789-01", "Sistemas"));
		Aluno aluno2 = alunoRepository.save(new Aluno("2", "Fulana", "123456780-02", "Sistemas"));
		
		Polo polo1 = poloRepository.save(new Polo("Maringá"));
		Polo polo2 = poloRepository.save(new Polo("Londrina"));
		Polo polo3 = poloRepository.save(new Polo("Curitiba"));
		
		
		
	}

}
