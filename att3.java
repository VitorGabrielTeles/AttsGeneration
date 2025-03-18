package att_java04;

import java.util.Scanner;

public class att3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
    
    System.out.println("Digite o Salario Bruto: ");
    float salBruto = scanner.nextFloat();
    
    System.out.println("Digite o Adicional Noturno: ");
    float adicional = scanner.nextFloat();
    
    System.out.println("Digite as Horas Extras: ");
    float extras = scanner.nextFloat();
    
    System.out.println("Digite os Descontos: ");
    float desc = scanner.nextFloat();
    
    float salarioLiquido = salBruto + adicional + (extras * 5) - desc;
    
    System.out.printf("Novo Salário: %.2f%n", salarioLiquido);
}
}
