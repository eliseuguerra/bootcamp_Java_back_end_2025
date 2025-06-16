import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scan.next();
        System.out.println("Digite o ano de nascimento: ");
        int year = scan.nextInt();
        int currentYear = 2025;
        int age = currentYear - year;
        System.out.printf("Seu nome é %s e sua idade é %d anos", name, age);
    }
}
