package com.RuanPablo2.gamelist.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gamelist")
                        .version("1.0")
                        .description("Gamelist é uma API REST que permite a listagem e reordenação de jogos de forma dinâmica e eficiente." +
                                " Foi desenvolvida para aprofundar meus estudos na linguagem **Java** e o processo de **deploy de aplicações web**." +
                                " Foi implementada com **Spring Boot** feita a persistência com **Spring Data JPA**."));

    }
}