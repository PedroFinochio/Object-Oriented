package Bank;

import Bank.Conta;
import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o saldo da conta ? ");
        float saldoConta = scanner.nextFloat();

        if(saldoConta >=0){
            Conta conta = new Conta(saldoConta);

            System.out.println("Criando uma conta com saldo de R$" + saldoConta);

            System.out.println("Quanto deseja sacar ? ");
            float saque = scanner.nextFloat();
            System.out.println("Sacando R$" + conta.sacar(saque));

            System.out.println("Quanto deseja depositar ? ");
            float deposito = scanner.nextFloat();
            System.out.println("Depositando R$" + conta.depositar(deposito));

            System.out.println("O saldo da conta é R$" + conta.getSaldo());

        }else{
            System.out.println("Não é possível criar a conta.");
        }

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("Qual o saldo da conta 2 ? ");
        float saldoConta2 = scanner.nextFloat();

        if(saldoConta2 >=0){
            Conta conta2 = new Conta(saldoConta2);

            System.out.println("Criando uma conta com saldo de R$" + saldoConta2);

            System.out.println("Quanto deseja sacar ? ");
            float saque2 = scanner.nextFloat();
            System.out.println("Sacando R$" + conta2.sacar(saque2));

            System.out.println("Quanto deseja depositar ? ");
            float deposito2 = scanner.nextFloat();
            System.out.println("Depositando R$" + conta2.depositar(deposito2));

            System.out.println("O saldo da conta é R$" + conta2.getSaldo());

        }else{
            System.out.println("Não é possível criar a conta.");
        }

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("Qual o saldo da conta 3  ? ");
        float saldoConta3 = scanner.nextFloat();

        if(saldoConta3 >=0){
            Conta conta3 = new Conta(saldoConta3);

            System.out.println("Criando uma conta com saldo de R$" + saldoConta3);

            System.out.println("Quanto deseja sacar ? ");
            float saque3 = scanner.nextFloat();
            System.out.println("Sacando R$" + conta3.sacar(saque3));

            System.out.println("Quanto deseja depositar ? ");
            float deposito3 = scanner.nextFloat();
            System.out.println("Depositando R$" + conta3.depositar(deposito3));

            System.out.println("O saldo da conta é R$" + conta3.getSaldo());

        }else{
            System.out.println("Não é possível criar a conta.");
        }
    }
}
