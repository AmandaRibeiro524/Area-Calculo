import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
		float area, lado, base, altura;
		int escolha;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Triângulo 2 / Quadrado 1:  ");
		escolha = entrada.nextInt();
		
		switch (escolha) {
		case 1:
			Scanner entrada2 = new Scanner(System.in);
			System.out.println(" Qual o valor do seu quadradro? ");
			lado = entrada2.nextFloat();
		
			area = lado * lado;
			System.out.println("Sua área do quadrado é:" + area);
		
			break;
		
		case 2:
			
			Scanner entrada3 = new Scanner(System.in);
			System.out.println(" Qual o valor da base do seu triângulo? ");
			base = entrada3.nextFloat();
		
			System.out.println(" Qual o valor da altura do seu triângulo? ");
			altura = entrada3.nextFloat();
		
			area = (base * altura)/2;
			System.out.println("Sua área do triângulo é:" + area);	
			break;
			
		default:
			System.out.println("Voccê escolheu uma opção inválida!");
		
		
		}
		
		
	}
}



