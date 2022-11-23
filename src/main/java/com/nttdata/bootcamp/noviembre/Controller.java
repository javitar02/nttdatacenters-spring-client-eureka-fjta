package com.nttdata.bootcamp.noviembre;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	public String getPuerto() {
		return "El puerto del micro es "+port;
	}
}
