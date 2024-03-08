package com.xconline.content.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: qhy
 * @date: 2024-03-08 11:48
 * @description: 接口文档
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket getDocket() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("《学成在线》后端API接口文档")
                .description("此文档详细描述了学成在线项目后端接口规范...")
                .version("v2.0.3")
                .contact(new Contact("qhy","www.qhy.com","qhy@gmail.com"));
        ApiInfo apiInfo = apiInfoBuilder.build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xconline.content.controller"))
                .paths(PathSelectors.any())
                .build();

    }
}
