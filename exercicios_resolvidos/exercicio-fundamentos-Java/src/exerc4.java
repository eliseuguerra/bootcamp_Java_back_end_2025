import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da 1ª pessoa: ");
        String name = scan.next();
        System.out.println("Digite a idade da 1ª pessoa: ");
        int age = scan.nextInt();
        System.out.println("Digite o nome da 2ª pessoa: ");
        String name2 = scan.next();
        System.out.println("Digite a idade da 2ª pessoa: ");
        int age2 = scan.nextInt();
        if(age > age2){
            int vl = age - age2;
            System.out.println("A diferença é de: "+vl+" anos");
        } else if (age2 < age) {
            int vl2 = age2 - age;
            System.out.println("A diferença é de: "+vl2+" anos");
        } else if (age == age2) {
            System.out.println("Não a diferença!!");
        }
    }
}
