package com.rcruz.foovar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class FoovarApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoovarApplication.class, args);
    }

    @Bean
    public Docket swaggerConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rcruz.foovar"))
                .build()
                .apiInfo(fillApiInfo());
    }

    private ApiInfo fillApiInfo() {
        return new ApiInfo(
                "Foovar API",
                "Testing project",
                "1.0",
                "",
                new springfox.documentation.service.Contact("Ramón De la Cruz Martinez", "https://github.com/RdelaCruzMartinez", "randomdevpm@gmail.com"),
                "",
                "",
                Collections.emptyList()
        );
    }

}
