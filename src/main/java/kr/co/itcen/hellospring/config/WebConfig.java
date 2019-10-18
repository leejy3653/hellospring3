package kr.co.itcen.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({ "kr.co.itcen.hellospring.controller" }) // auto-scan
public class WebConfig {

	@Bean // 뷰리졸버 설정
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		//viewResolver.setOrder(1);
		viewResolver.setExposeContextBeansAsAttributes(true);
		return viewResolver;
	}

}
