import encapsulamento.versao3.Veiculo;

import java.util.Scanner;

public class TesteVeiculo3 {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a carga máxima do veículo ? ");
        int cargaMaxima = scanner.nextInt();
        if(cargaMaxima > 0){

            Veiculo veiculo3 = new Veiculo(cargaMaxima);

            System.out.println("Criando um veículo com carga máxima de " + cargaMaxima + " kg");

            System.out.print("Qual o peso da primeira carga (em kg) ? ");
            int carga1 = scanner.nextInt();
            System.out.println(veiculo3.adicionarCaixa(carga1));

            System.out.print("Qual o peso da segunda carga (em kg) ? ");
            int carga2 = scanner.nextInt();
            System.out.println(veiculo3.adicionarCaixa(carga2));

            System.out.print("Qual o peso da terceira carga (em kg) ? ");
            int carga3 = scanner.nextInt();
            System.out.println(veiculo3.adicionarCaixa(carga3));

            System.out.print("Qual o peso da quarta carga (em kg) ? ");
            int carga4 = scanner.nextInt();
            System.out.println(veiculo3.adicionarCaixa(carga4));

            System.out.print("Qual o peso da quinta carga (em kg) ? ");
            int carga5 = scanner.nextInt();
            System.out.println(veiculo3.adicionarCaixa(carga5));

            System.out.println("A carga do veículo é: " + veiculo3.getCargaKg() + " kg");
        }else{
            System.out.println("Coloque uma carga positiva");
        }
    }
}
