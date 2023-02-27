package br.ufpr.tabajaras.domain;

import java.util.List;

import lombok.Data;

@Data
public class ListaDeFuncionarios {
	
    private static List<Funcionario> funcionarios;

    public Info retornaFuncionarioInfos(Funcionario func) {
        for (Funcionario funcionario : funcionarios) {
			if (func.getNome().equals(funcionario.getNome())) {
				return funcionario.getInfos();
			}
		}
        System.out.println("Funcionario nao encontrado");
        return null;
    }

    public void adicionaFunc(Funcionario func) {
        funcionarios.add(func);
    }

    public Funcionario buscaFunc(Integer ID) {
      return funcionarios.get(ID);
    }

    public void alterarInformacoes(Funcionario func) {
    	funcionarios.add(func);
    }

    public void excluiFuncionario(Funcionario func) {
    	funcionarios.remove(func);
    }
}