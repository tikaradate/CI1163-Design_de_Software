package br.ufpr.tabajaras.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BaseDeProjetos {
	
	private List<Projeto> projetos = new ArrayList<>();
	private String numeroAtual;
	
	public String getNumeroCobranca(Projeto p) {
		return p.getNumeroCobranca().toString();
	}

}
