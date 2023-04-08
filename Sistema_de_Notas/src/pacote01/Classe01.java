package pacote01;

import javax.swing.JOptionPane;

public class Classe01 { // hello world

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("informe o valor da nota 1");
		String nota2 = JOptionPane.showInputDialog("informe o valor da nota 2");
		String nota3 = JOptionPane.showInputDialog("informe o valor da nota 3");
		String nota4 = JOptionPane.showInputDialog("informe o valor da nota 4");

		double n1, n2, n3, n4;
		n1 = Double.parseDouble(nota1);
		n2 = Double.parseDouble(nota2);
		n3 = Double.parseDouble(nota3);
		n4 = Double.parseDouble(nota4);
		double somaNotas = n1 + n2 + n3 + n4;
		double media = somaNotas / 4;
		double resto = somaNotas % 4;

		JOptionPane.showMessageDialog(null, "A média do aluno foi: " + media + "."  // Primeiro painél de menssagem
				+ " E o resto da divisão da quantidade de notas pelas notas foi " + resto);

		if (media > 8) {  															// Segundo painél de menssagens
			JOptionPane.showMessageDialog(null,
					"Aluno aprovado! Sua média de " + media + " é muito alta, PARABÉNS pelo desempenho");
		} else if (media >= 7 && media <= 8) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado");
		} else if (media >= 5 && media < 7) {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação");
		} else {
			JOptionPane.showMessageDialog(null,
					"Aluno reprovado. Sua média de " + media + " é muito baixa, procure melhorar seu desempenho");
		}
	}

}
