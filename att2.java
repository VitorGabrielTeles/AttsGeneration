package att_java04;

import java.util.Scanner;

public class att2 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
     
     System.out.println("Digite a nota 1: ");
     float n1 = scanner.nextFloat();
     
     System.out.println("Digite a nota 2: ");
     float n2 = scanner.nextFloat();
     
     System.out.println("Digite a nota 3: ");
     float n3 = scanner.nextFloat();
     
     System.out.println("Digite a nota 4: ");
     float n4 = scanner.nextFloat();
     
     float media = (n1 + n2 + n3 + n4) / 4;
     
     System.out.printf("Novo Salário: %.2f%n", media);
}
}
