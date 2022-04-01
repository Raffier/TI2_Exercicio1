import java.util.*;

public class SomarDoisNumeros {

	// Chama Scanner
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Declara variaveis
		int num1, num2, soma;

		// Leitura dos números

		System.out.println("Insira o primeiro numero: ");
		num1 = entrada.nextInt();

		System.out.println("Insira o segundo numero: ");
		num2 = entrada.nextInt();

		// Soma
		soma = num1 + num2;

		// Imprime na Tela
		System.out.println("A soma de " + num1 + " e " + num2 + " e: " + soma);
	}
}
