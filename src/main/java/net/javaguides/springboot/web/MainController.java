package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
//	@GetMapping("/")
//	public String home() {
	//	return "index";
//	}

	@GetMapping("/")
	public String homepage() {
		return "Homepage";
	}

	@GetMapping("/index2.html")
	public String ind() {

		return "index2.html";
	}

	@GetMapping("/index3.html")
	public String indi() {
		return "index3.html";
	}

	@GetMapping("/index4.html")
	public String indie() {
		return "index4.html";
	}

	@GetMapping("/index5.html")
	public String india() {
		return "index5.html";
	}

	@GetMapping("/spring.html")
	public String indip() {
		return "spring.html";
	}

	@GetMapping("/summer.html")
	public String indio() {
		return "summer.html";
	}

	@GetMapping("/weraspring.html")
	public String indier() {
		return "weraspring.html";
	}

	@GetMapping("/werafall.html")
	public String indila() {
		return "werafall.html";
	}

	@GetMapping("/yayspring.html")
	public String indiea() {
		return "yayspring.html";
	}

	@GetMapping("/yaywinter.html")
	public String indiu() {
		return "yaywinter.html";
	}

	@GetMapping("/jojosummer.html")
	public String indiaa() {
		return "jojosummer.html";
	}

	@GetMapping("/jojowinter.html")
	public String indiju() {
		return "jojowinter.html";
	}

	@GetMapping("/payment.html")
	public String iglu() {
		return "payment.html";
	}

	@GetMapping("/end.html")
	public String indgu() {
		return "end.html";
	}



	//@RequestMapping("/index2")



}
