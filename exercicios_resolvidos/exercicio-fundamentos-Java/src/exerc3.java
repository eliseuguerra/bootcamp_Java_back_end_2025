import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double base = scan.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = scan.nextByte();
        double area = base * altura;
        System.out.println("O valor da area é: "+ area);

    }
}
