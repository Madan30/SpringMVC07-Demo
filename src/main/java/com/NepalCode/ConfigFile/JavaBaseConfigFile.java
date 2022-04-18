package com.NepalCode.ConfigFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.NepalCode.Controllers")
public class JavaBaseConfigFile {
	
	
	// set up view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver internalView = new InternalResourceViewResolver();
		internalView.setPrefix("/WEB-INF/view/");
		internalView.setSuffix(".jsp");
		
		return internalView;	
	}

}
