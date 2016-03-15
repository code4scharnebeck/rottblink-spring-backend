package org.rottblink.backend.config;

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
 * has to be placed here - don't know why under connector.rest.config doesn't
 * work
 * 
 * @author karsten
 *
 */
@Configuration
@ComponentScan(basePackageClasses = { GroupsApi.class })
@EnableWebMvc
@EnableSwagger2 // Loads the spring beans required by the framework
@PropertySource("classpath:swagger.properties")
@Import(SwaggerUiConfiguration.class)
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-26T20:54:27.472Z")
public class SwaggerConfiguration {

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2)//
				.apiInfo(metadata()).select()//
				.apis(RequestHandlerSelectors.any())//
				.paths(PathSelectors.any())//
				.build();
	}

	private static ApiInfo metadata() {
		return new ApiInfoBuilder().title("My awesome API")//
				.description("Some description")//
				.version("1.0")//
				.contact(new Contact("me", "example.com", "my-email@domain.org"))//
				.build();
	}

}