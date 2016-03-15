package org.rottblink.backend.config;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.rottblink.backend.connector.rest.api.GroupsApi;
import org.rottblink.backend.connector.rest.config.SwaggerUiConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * configures the dozer mapper
 * 
 * @author karsten
 *
 */
@Configuration
public class DozerConfiguration {

	BeanMappingBuilder builder = new BeanMappingBuilder() {
	      protected void configure() {
//	        mapping(Bean.class, Bean.class,
//	                TypeMappingOptions.oneWay(),
//	                mapId("A"),
//	                mapNull(true)
//	        )
//	                .exclude("excluded")
//	                .fields("src", "dest",
//	                        copyByReference(),
//	                        collectionStrategy(true, 
//	                            RelationshipType.NON_CUMULATIVE),
//	                        hintA(String.class),
//	                        hintB(Integer.class),
//	                        FieldsMappingOptions.oneWay(),
//	                        useMapId("A"),
//	                        customConverterId("id")
//	                )
//	                .fields("src", "dest",
//	                    customConverter("org.dozer.CustomConverter")
//	                );
	      }
	    };

	@Bean(name = "org.dozer.Mapper")
	public DozerBeanMapper dozerBean() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.addMapping(builder);
		return mapper;
	}

}