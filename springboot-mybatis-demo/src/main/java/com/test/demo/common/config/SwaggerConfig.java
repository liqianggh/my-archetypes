package com.test.demo.common.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;


/**
 * swagger配置
 * 默认只有在dev环境下才可以访问swagger-ui配置
 *
 * @author Jann Lee
 * @date 2019-08-25 23:21
 **/
@EnableSwagger2
@Configuration
@Profile(value = {"dev"})
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.demo"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(globalParameters());
     }

    private List<Parameter> globalParameters() {
        ParameterBuilder builder = new ParameterBuilder()
                .description("用户凭证")
                .name("Authentication")
                .modelRef(new ModelRef("string"))
                .parameterType("header");
        return Lists.newArrayList(builder.build());
    }


    @SuppressWarnings("deprecation")
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger demo test")
                .description("the api of demo")
                .termsOfServiceUrl("http://www.mycookies.cn")
                .contact("Jann Lee")
                .version("3.0")
                .build();
    }

}