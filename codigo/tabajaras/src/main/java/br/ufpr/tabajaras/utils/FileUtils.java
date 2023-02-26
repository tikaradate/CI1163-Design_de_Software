package br.ufpr.tabajaras.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtils {

    public static String lerEntrada(){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			return br.readLine();
		} catch (IOException ioe) {
			System.out.print("Erro ao ler");
		}
		return "";
	}
    
}
