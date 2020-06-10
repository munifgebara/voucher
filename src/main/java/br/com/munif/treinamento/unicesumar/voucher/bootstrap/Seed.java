package br.com.munif.treinamento.unicesumar.voucher.bootstrap;

import java.util.HashSet;
import java.util.Set;

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
import br.com.munif.treinamento.unicesumar.voucher.entidades.CampanhaVoucher;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Candidato;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Concurso;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Polo;
import br.com.munif.treinamento.unicesumar.voucher.entidades.Voucher;
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
		
		Set<Polo> polos = new HashSet<>();
		polos.add(polo1);
		polos.add(polo2);
		
		Concurso concurso1 = concursoRepository.save(new Concurso(2020, 2));
		Concurso concurso2 = concursoRepository.save(new Concurso(2021, 1));
		
		Set<Concurso> concursos=new HashSet<>();
		concursos.add(concurso1);
		
		
		
		
		
		CampanhaVoucher campanhaVoucher = campanhaVoucherRepository.save(new CampanhaVoucher("2020-2",concursos, polos));
		
		
		Voucher voucher1=voucherRepository.save(new Voucher("VFO1", aluno1, campanhaVoucher));
		Voucher voucher2=voucherRepository.save(new Voucher("VFO2", aluno1, campanhaVoucher));
		Voucher voucher3=voucherRepository.save(new Voucher("VFA1", aluno2, campanhaVoucher));
		
		Candidato candidato1=candidatoRepository.save(new Candidato("Fulano de TAL", "111111111-01", "Sistemas", polo1, voucher1, true, concurso1));
		Candidato candidato2=candidatoRepository.save(new Candidato("Fulana de OUTRO", "22222222-01", "Sistemas", polo2, voucher2, false, concurso1));
		Candidato candidato3=candidatoRepository.save(new Candidato("Fulano de MAL", "3333333-01", "Sistemas", polo2, null, true, concurso1));
		
		
		
		
		
		
	}

}
