package com.john.jpainheritjoinedtable;

import com.john.jpainheritjoinedtable.model.Archer;
import com.john.jpainheritjoinedtable.model.Infantry;
import com.john.jpainheritjoinedtable.model.InfantryType;
import com.john.jpainheritjoinedtable.model.Knight;
import com.john.jpainheritjoinedtable.repository.ArcherRepository;
import com.john.jpainheritjoinedtable.repository.InfantryRepository;
import com.john.jpainheritjoinedtable.repository.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritJoinedTableApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(JpaInheritJoinedTableApplication.class, args);

		InfantryRepository archerRepository = configurableApplicationContext.getBean(ArcherRepository.class);
		InfantryRepository knightRepository = configurableApplicationContext.getBean(KnightRepository.class);
		Infantry archer = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
		Infantry knight = new Knight(InfantryType.HEAVY, 200, 1000, 300, true);

		archerRepository.save(archer);
		knightRepository.save(knight);
		archerRepository.delete(archer);
	}

}
