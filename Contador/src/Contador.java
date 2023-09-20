import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

			// Imprimindo uma mensagem após o loop for
			int diferencaTotal = parametroDois - parametroUm;
			System.out.println("Contagem concluída. A diferença entre os dois numeros é " + diferencaTotal);
		} catch (ParametrosInvalidosException exception) {
			// Imprimir a mensagem da exceção
			System.out.println(exception.getMessage());
		} finally {
			// Fechar o Scanner para evitar vazamento de recursos
			terminal.close();
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		// int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = parametroUm; i <= parametroDois; i++) {
			System.out.println(i);
		}
	}
}