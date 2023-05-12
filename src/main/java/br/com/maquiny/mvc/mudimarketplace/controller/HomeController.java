package br.com.maquiny.mvc.mudimarketplace.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.maquiny.mvc.mudimarketplace.model.Order;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		 Order order = new Order();
		 order.setNameProduct("Smart TV LED 43p 4K UHD Samsung");
		 order.setUrlImage("https://m.media-amazon.com/images/I/81IdScEcX2S._AC_UL400_.jpg");
		 order.setUrlProduct("https://www.amazon.com.br/UN43AU7700GXZD-SAMGUNG-TV-CRYSTAL-UHD/dp/B09QV7PZM6/ref=sr_1_5?crid=2VX9NYCWNELNE&keywords=televis%C3%A3o&qid=1683916079&sprefix=tele%2Caps%2C233&sr=8-5&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		 order.setDescription("Ultra HD 4k\r\n"
		 		+ "60Hz\r\n"
		 		+ "Wi-Fi integrado\r\n"
		 		+ "Xbox dentro da sua TV");
		
		 List<Order> requests  = Arrays.asList(order);
		 model.addAttribute("requests", requests);
		 
		
		return "home";
	}
}
