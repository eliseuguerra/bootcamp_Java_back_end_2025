import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double weight = scan.nextDouble();
        System.out.println("Digite sua altura: ");
        double height = scan.nextDouble();
        double imc = weight/(height*height);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.6 && imc <=24.9){
            System.out.println("Peso ideal");
        } else if (imc >=25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >=30 && imc <= 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3 (morbida)");
        }
        scan.close();
    }
}

