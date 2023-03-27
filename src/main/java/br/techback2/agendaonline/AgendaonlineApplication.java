package br.techback2.agendaonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AgendaonlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaonlineApplication.class, args);
	}

}
