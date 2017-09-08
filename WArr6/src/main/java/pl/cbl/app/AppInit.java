package pl.cbl.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class AppInit implements WebApplicationInitializer {
	
	
	public void onStartup(ServletContext container) throws ServletException {
			
			
			
	AnnotationConfigWebApplicationContext contex = new AnnotationConfigWebApplicationContext();
			
	contex.register(AppConfig.class);
	contex.setServletContext(container);
			
	ServletRegistration.Dynamic srv = container.addServlet("dispatcher", new DispatcherServlet(contex));
			
	srv.setLoadOnStartup(1);
	srv.addMapping("/");

		}
	
	
	
	
	
}
