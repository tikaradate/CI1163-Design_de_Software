package br.ufpr.tabajaras;

import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ufpr.tabajaras.domain.Gerente;

@SpringBootApplication
public class TabajarasApplication {

	InputStreamReader isr = new InputStreamReader(System.in);

	public static void main(String[] args) {
		SpringApplication.run(TabajarasApplication.class, args);
		Gerente.abrirEmpresa();
	}

	

}
