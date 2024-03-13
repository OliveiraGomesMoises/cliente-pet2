package br.com.petz.clientepet2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePet2Application {

	@GetMapping
	public String getHomeTeste() {
		return "cliente pet - API HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePet2Application.class, args);
	}

}
