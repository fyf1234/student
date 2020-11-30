package com.fyf.student.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fuyufan
 * @date 2020/11/26 10:29
 * @Configuration 是告诉 Spring Boot 需要加载这个配置类， @EnableSwagger2 是启用 Swagger2
 */

@Configuration
@EnableSwagger2
 public class SwaggerConfig {
    // private static final String DEFAULT_PATH = "/oss";
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

}
