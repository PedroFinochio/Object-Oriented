package Bank;
public class Conta {

    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double deposito){
        if(this.saldo >= 0) {
            this.saldo += deposito;
        }
        return deposito;
    }

    public double sacar(double amount) {
        if (amount <= this.saldo) {
            this.saldo -= amount;
        }
        return amount;
    }
}
