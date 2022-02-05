package quiz_perguntas;

public class Respostas {

	private int[] respostas = new int[10];

	public int resposta(int index) {

		respostas[0] = 0;
		respostas[1] = 9;
		respostas[2] = 18;
		respostas[3] = 27;
		respostas[4] = 36;
		respostas[5] = 45;
		respostas[6] = 54;
		respostas[7] = 63;
		respostas[8] = 72;
		respostas[9] = 81;

		return respostas[index];

	}

}
