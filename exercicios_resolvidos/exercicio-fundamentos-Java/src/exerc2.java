import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o lado do lado de um quadrado? ");
        double lado = scan.nextDouble();
        double area = lado * 2;
        System.out.println("O valor da area do quadrado é: "+ area);
    }
}
