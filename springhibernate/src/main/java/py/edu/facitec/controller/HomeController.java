package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//la Url a responder
	@RequestMapping
	public String index(){
		
		System.out.println("Hola Mundo Spring MVC");
		
		//Pagina a responder
		return "hola_mundo";
	}
}
