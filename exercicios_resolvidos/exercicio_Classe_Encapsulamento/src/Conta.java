public class Conta {
    private double balance;
    private double specialCheck;
    public double usedSpecialCheckValue;

public Conta(double initialBalance){
    if (initialBalance <= 0){
        System.out.println("Saldo inicial não pode ser negativo. A conta será iniciada com R$ 0,00");
    }else{
        this.balance = initialBalance;
    }
    this.usedSpecialCheckValue = 0.0;
}
public double consultbalance(){
    return this.balance;
}
public double consultspecialCheck(){
    return  this.specialCheck;
}
public boolean usingSpecialCheck(){
    return this.balance < 0;
}
public void deposit(double value){
    if(value <= 0){
        System.out.println("Valor para deposito tem que ser positivo");
        return;
    }
    this.balance += value;
    System.out.println("Depósito de R$" + String.format("%.2f", value) + " realizado.");

    if(usedSpecialCheckValue > 0){
        System.out.println("Verificando o uso do cheque especial...");
        if(this.balance >= 0){
            double specialCheckRate = usedSpecialCheckValue * 0.20;
            this.balance -= specialCheckRate;
            System.out.println("Cheque especial coberto! Taxa de R$" + String.format("%.2f", specialCheckRate) + " aplicada.");
            this.usedSpecialCheckValue = 0;
        } else{
            this.usedSpecialCheckValue = -this.balance;
        }
    }
    System.out.println(("Saldo atual: R$" + String.format("%.2f", this.balance)));
}
public boolean draw(double value){
    if(value <= 0){
        System.out.println("Valor para saque tem que ser positivo.");
        return false;
    }
    double totalAvailableBalance = this.balance + this.specialCheck;
    if (value > totalAvailableBalance) {
        System.out.println("Saldo insuficiente para realizar o saque de R$" + String.format("%.2f", value) + ".");
        System.out.println("Seu saldo disponível (incluindo cheque especial) é de R$" + String.format("%.2f", totalAvailableBalance) + ".");
        return false;
    }
    this.balance -= value;
    if (this.balance < 0) {
        // Se o saldo ficou negativo, significa que o cheque especial foi usado
        this.usedSpecialCheckValue = -this.balance; // O valor usado é o "negativo" do saldo
        System.out.println("Saque de R$" + String.format("%.2f", value) + " realizado. Você está usando R$" + String.format("%.2f", usedSpecialCheckValue) + " do cheque especial.");
    } else {
        System.out.println("Saque de R$" + String.format("%.2f", value) + " realizado.");
    }
    System.out.println("Saldo atual: R$" + String.format("%.2f", this.balance));
    return true;
}
public boolean pay(double billet) {
    if (billet <= 0) {
        System.out.println("Valor do boleto deve ser positivo.");
        return false;
    }
        System.out.println("Tentando pagar boleto de R$" + String.format("%.2f", billet) + "...");
        return draw(billet);
    }
private void calculateLimitSpecialCheck(double initialBalance) {
    if (initialBalance <= 500.00) {
        this.specialCheck = 50.00;
    } else {
        this.specialCheck = initialBalance * 0.50;
    }
        System.out.println("Limite de cheque especial definido em R$" + String.format("%.2f", this.specialCheck) + ".");
  }
}

