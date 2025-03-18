package att_java04;

import java.util.Scanner;

public class att4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero 1: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite o numero 2: ");
        float n2 = scanner.nextFloat();

        System.out.print("Digite o numero 3: ");
        float n3 = scanner.nextFloat();

        System.out.print("Digite o numero 4: ");
        float n4 = scanner.nextFloat();

        float diferenca = (n1 * n2) - (n3 * n4);

        System.out.printf("Diferença: %.1f%n", diferenca);

        scanner.close();
    }
}

