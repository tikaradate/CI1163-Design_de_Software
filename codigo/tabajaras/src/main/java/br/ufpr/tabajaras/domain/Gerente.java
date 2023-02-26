package br.ufpr.tabajaras.domain;

import br.ufpr.tabajaras.utils.FileUtils;
import lombok.Data;

@Data
public class Gerente implements Usuario {

    public static void abrirEmpresa(){
        while(true){
            String input = FileUtils.lerEntrada();
            if (input.equals("jorge")){
                System.out.println("Bem vindo lindão");
            }
        }

    }

    public void entrar(String usuario, String senha){
    }
    
}
