package att_java04;

import java.util.Scanner;

public class att1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.println("Digite o salario: ");
        float salario = scanner.nextFloat();
        
        System.out.print("Digite o abono: ");
        float abono = scanner.nextFloat();
        
        float novoSalario = salario + abono;
        
        System.out.printf("Novo Salário: %.2f%n", novoSalario);
        
        scanner.close();
    }
}
