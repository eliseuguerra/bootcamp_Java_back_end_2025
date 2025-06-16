import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int nextNumber;
        boolean validNumber = false;

        while (!validNumber) {
            System.out.print("Digite o número inicial (inteiro positivo): ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("O número inicial deve ser um inteiro positivo. Tente novamente.");
            } else {
                validNumber = true;
            }
        }
        System.out.println("\nNúmero inicial definido como: " + number);
        System.out.println("Agora, digite outros números. A execução parará quando um número for divisível pelo número inicial (resto 0).");
        System.out.println("Números menores que o número inicial serão ignorados.");

        while (true) {
            System.out.print("Digite o próximo número (ou um valor que divida o inicial para parar): ");
            nextNumber = scanner.nextInt(); // Assume entrada válida

            // 2.1. Ignorar números menores que o número inicial
            if (nextNumber < number) {
                System.out.println("Número " + nextNumber + " ignorado, pois é menor que o número inicial (" + number + ").");
                continue; // Volta para o início do loop
            }

            if (nextNumber % number != 0) {
                System.out.println("Número " + nextNumber + " informado.");
                System.out.println("Divisão de " + nextNumber + " por " + number + " tem resto " + (nextNumber % number) + " (DIFERENTE de 0).");
                System.out.println("Condição de parada atingida. Encerrando a execução.");
                break;
            } else {
                System.out.println("Número " + nextNumber + " informado.");
                System.out.println("Divisão de " + nextNumber + " por " + number + " tem resto " + (nextNumber % number) + " (IGUAL a 0).");
                System.out.println("A execução continuará, pois o resto é 0.");
            }
        }

        scanner.close();
    }
}