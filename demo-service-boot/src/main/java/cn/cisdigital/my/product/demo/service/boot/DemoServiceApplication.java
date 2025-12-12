package cn.cisdigital.my.product.demo.service.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 应用启动类。
 */
@SpringBootApplication(scanBasePackages = {"cn.cisdigital.my.product.demo.service"}, exclude = {
		ErrorMvcAutoConfiguration.class})
public class DemoServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoServiceApplication.class);
		springApplication.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		// 支持 Spring Boot 在外部 WEB 容器中启动
		return applicationBuilder.sources(DemoServiceApplication.class);
	}
}
