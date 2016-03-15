package org.rottblink.backend.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

@Configuration
@EntityScan(basePackages = { "org.rottblink.backend" })
@EnableJpaRepositories(basePackages = { "org.rottblink.backend" })
public class PersistenceConfiguration extends JpaRepositoryConfigExtension {
	// I added some code to put two persons into the database here.
}