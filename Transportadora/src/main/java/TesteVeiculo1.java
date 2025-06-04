import encapsulamento.versao1.Veiculo;

public class TesteVeiculo1 {

    public static void main (String [] args){

        Veiculo veiculo1 = new Veiculo(10000);

        System.out.println("Criando um veículo com carga máxima de " + veiculo1.getCargaMaxima());
        System.out.println("Adicionando Caixa número 1 (500kg) ");
        veiculo1.carga += 500;
        System.out.println("Adicionando Caixa número 2 (250kg) ");
        veiculo1.carga += 250;
        System.out.println("Adicionando Caixa número 3 (5000kg) ");
        veiculo1.carga += 5000;
        System.out.println("Adicionando Caixa número 4 (4000kg) ");
        veiculo1.carga += 4000;
        System.out.println("Adicionando Caixa número 5 (300kg) ");
        veiculo1.carga += 300;
        System.out.println("A carga do veículo é: " + veiculo1.carga);

    }
}
