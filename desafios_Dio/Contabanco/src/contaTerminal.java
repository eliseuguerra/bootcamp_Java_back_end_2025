import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String agency;
        String name;
        float balance;

        System.out.println("Digite o numero da conta: ");
        number = scan.nextInt();
        System.out.println("Digite a agencida do banco: ");
        agency = scan.next();
        System.out.println("Digite seu nome completo: ");
        name = scan.next();
        System.out.println("Digite seu saldo: ");
        balance = scan.nextFloat();

        System.out.printf("Ola %s, obrigado por criar conta em nosso banco, a sua agencia é %s, conta %d, e seu saldo é R$ %.2f, ja esta disponivel para saque.", name,agency, number, balance);

    }
}
