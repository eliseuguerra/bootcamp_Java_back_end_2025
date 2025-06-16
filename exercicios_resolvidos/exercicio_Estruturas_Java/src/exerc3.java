import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        int vl1;
        int vl2;
        int parimpar;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            vl1 = scan.nextInt();
            System.out.println("Digite outro numero: ");
            vl2 = scan.nextInt();
            if (vl1 <= vl2) {
                System.out.println("Segundo numero tem que ser maior que o primeiro!");
            } else {
                break;
            }
            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - para par");
                System.out.println("2 - para impar");
                System.out.println("Sua escolha: ");
                parimpar = scan.nextInt();
                if (parimpar == 1 || parimpar == 2) {
                    break;
                } else {
                    System.out.println("Opção invalida! Digite novamente 1 ou 2");
                }
            }
            for (int i = vl2; i >= vl1; i--) {
                if (parimpar == 1) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                } else {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
