import encapsulamento.versao3.Veiculo;

public class TesteVeiculo3 {

    public static void main (String [] args){

        Veiculo veiculo3 = new Veiculo(10000);

        System.out.println("Criando um veículo com carga máxima de 10.000 kg");
        System.out.print("Adicionando caixa número 1 (500kg): ");
        System.out.println(veiculo3.adicionarCaixa(500));
        System.out.print("Adicionando caixa número 2 (250kg): ");
        System.out.println(veiculo3.adicionarCaixa(250));
        System.out.print("Adicionando caixa número 3 (5000kg): ");
        System.out.println(veiculo3.adicionarCaixa(5000));
        System.out.print("Adicionando caixa número 4 (4000kg): ");
        System.out.println(veiculo3.adicionarCaixa(4000));
        System.out.print("Adicionando caixa número 5 (300kg): ");
        System.out.println(veiculo3.adicionarCaixa(300));
        System.out.println("A carga do veículo é: " + veiculo3.getCarga());
    }
}
