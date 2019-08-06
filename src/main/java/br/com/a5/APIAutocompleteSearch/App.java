package br.com.a5.APIAutocompleteSearch;

import java.util.Scanner;

import br.com.a5.APIAutocompleteSearch.model.Conexao;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a busca: ");
		String q = entrada.nextLine();
		
		Conexao conexao = new Conexao();
		conexao.consultaAutoCompleta(q);
	}
}
