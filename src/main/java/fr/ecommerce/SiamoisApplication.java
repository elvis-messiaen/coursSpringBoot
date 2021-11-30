package fr.ecommerce;

import fr.ecommerce.entity.Role;
import fr.ecommerce.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SiamoisApplication {

	public static void main(String[] args) {

		SpringApplication.run(SiamoisApplication.class, args);
	}

	/*
		exemple pour la création des roles
		pour la création RoleRepository
	 */

	@Bean
	CommandLineRunner start (RoleRepository roleRepository) {
		return args -> {
			//si besoin de recuperer l'instance de Object dans une autre instance il faut la stocker dans une variable)
			Role administrateur = new Role(null,"ADMINISTRATEUR");
			roleRepository.save(new Role(null,"UTILISATEUR"));
			roleRepository.save(administrateur);

		};
	}

}
