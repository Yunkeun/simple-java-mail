package com.yoonveloping.simplemail.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi categoryApi() {
        return GroupedOpenApi.builder()
                .group("mail")
                .pathsToMatch("/auth/mail/**")
                .build();
    }

    @Bean
    public OpenAPI mailOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("mail API")
                        .description("mail API 입니다.")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("github link")
                        .url("https://github.com/Yunkeun/simple-java-mail"));
    }
}
