package com.NepalCode.ConfigFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JavaBaseAppInitalizer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(JavaBaseConfigFile.class);
		
		// creating object of dispatcher servelt
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register dispatcher servelt and mapped the url
		  ServletRegistration.Dynamic registration = servletContext.addServlet("mydispatcherServelt", dispatcherServlet);
		  registration.addMapping("/home/*");
		  registration.setLoadOnStartup(1);
		
	}

}
