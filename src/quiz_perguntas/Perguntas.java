package quiz_perguntas;

public class Perguntas {

	private String[] perguntas = new String[10];

	public String  questoes(int index) {

		perguntas[0] = "Quanto � 9x0 ?";
		perguntas[1] = "Quanto � 9x1 ?";
		perguntas[2] = "Quanto � 9x2 ?";
		perguntas[3] = "Quanto � 9x3 ?";
		perguntas[4] = "Quanto � 9x4 ?";
		perguntas[5] = "Quanto � 9x5 ?";
		perguntas[6] = "Quanto � 9x6 ?";
		perguntas[7] = "Quanto � 9x7 ?";
		perguntas[8] = "Quanto � 9x8 ?";
		perguntas[9] = "Quanto � 9x9 ?";
		
		return perguntas[index];

	}
}
