public class ContaTeste {
    public static void main(String[] args) {
        System.out.println("--- Criando conta 1 (saldo inicial R$200,00) ---");
        Conta conta1 = new Conta(200);
        System.out.println("Saldo atual: R$" + String.format("%.2f", conta1.consultbalance()));
        System.out.println("Cheque especial: R$" + String.format("%.2f", conta1.consultspecialCheck()));
        System.out.println("Está usando cheque especial? " + conta1.usingSpecialCheck());

        System.out.println("\n--- Operações na conta 1 ---");
        conta1.pay(30);
        System.out.println("Está usando cheque especial? " + conta1.usingSpecialCheck());


    }
}
