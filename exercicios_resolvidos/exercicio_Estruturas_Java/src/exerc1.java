import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int vl = scan.nextInt();
        for (int i = 1; i <=10;i++ ){
            int result = vl * i;
            System.out.println(vl+ "x"+ i + "=" + result);
        }
        scan.close();
    }
}
