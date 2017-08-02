package py.edu.facitec.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.controller.HomeController;
import py.edu.facitec.controller.UtilidadController;

//Habilita la arquitectura mvc de spring
@EnableWebMvc
//clase a gestionar por Spring
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
	//definir un metodo gestionado por spring
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//prefijo para todas las paginas
		resolver.setPrefix("/WEB-INF/views/");
		//sufijo para todas las paginas
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
