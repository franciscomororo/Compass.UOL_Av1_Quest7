package quiz_perguntas;

import java.util.Scanner;

public class Questionario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int acertos = 0;
		int erros = 0;
		Usuario usuario = new Usuario();
		Perguntas perguntas = new Perguntas();
		Respostas respostas = new Respostas();

		System.out.println("Qual o seu nome? ");
		usuario.setNome(entrada.nextLine());

		for (int i = 0; i <= 9; i++) {
			System.out.println(perguntas.questoes(i));
			if (entrada.nextInt() == respostas.resposta(i)) {
				System.out.println("Você Acertou!!!");
				acertos++;
			} else {
				System.out.println("Você Errou!!!");
				erros++;
			}

		}
		System.out.println("\nNome: " + usuario.getNome());
		System.out.println("Acertos: " + acertos);
		System.out.println("Erros: " + erros);
	}

}
