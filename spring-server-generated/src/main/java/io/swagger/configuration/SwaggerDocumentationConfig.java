package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API References")
            .description("The **Linkage API** is built on RESTful principles and returns JSON encoded-responses and accepts JSON payloads. It is only available through HTTPS to ensure the security of the data in transfer.  The API operates in two environments: **production** and **sandbox**.  Sandbox environment returns mock data and is used for testing the basic fucntionality of the system.  Production environment is used to retrieve the real accounts connected through Linkage.             ")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("https://linkagehq.com/contact-us")
            .version("v1.0")
            .contact(new Contact("","", "contact@linkagehq.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
