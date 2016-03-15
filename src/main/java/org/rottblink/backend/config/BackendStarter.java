package org.rottblink.backend.config;

import org.dozer.DozerBeanMapper;
import org.dozer.classmap.RelationshipType;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;
import org.dozer.loader.api.TypeMappingOptions;
import static org.dozer.loader.api.FieldsMappingOptions.*;
import static org.dozer.loader.api.TypeMappingOptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(scanBasePackages = { "org.rottblink.backend" })
@SpringBootApplication
@ComponentScan("org.rottblink.backend")
public class BackendStarter {
	private Logger logger = LoggerFactory.getLogger(BackendStarter.class);

	// @Bean
	// CommandLineRunner init(GroupRepository groupRepository,
	// GroupMeetingRepository meetingRepository) {
	// return (evt) -> Arrays.asList("jonglieren,singen".split(",")).forEach(a
	// -> {
	// Group group = new Group();
	// group.setName(a);
	// group.setMapMarkerPosition(new LatLng(LatLngUtil.getRandomLatitude(),
	// LatLngUtil.getRandomLongitude()));
	// RegularMeetingRule regularMeetingRule = new RegularMeetingRule();
	// regularMeetingRule.setRepeatDayOfWeek(4);
	// regularMeetingRule.setStartDate(LocalDate.now());
	// group.setRules(Arrays.asList(regularMeetingRule));
	// Group account = groupRepository.save(group);
	// });
	// }
	
	public static void main(String[] args) {
		SpringApplication.run(BackendStarter.class, args);
	}
}
