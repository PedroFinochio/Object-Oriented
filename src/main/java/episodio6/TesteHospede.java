package episodio6;

import episodio1.Hospede;

public class TesteHospede {

    public static void main (String [] args){

        Hospede hospede = new Hospede();

        hospede.setNome("Pedro");
        hospede.setSobrenome("Finochio");

        System.out.println("Nome: " + hospede.getNome());
        System.out.println("Sobrenome: " + hospede.getSobrenome());

        Hospede hospede2 = new Hospede();

        hospede2.setNome("Dexter");
        hospede2.setSobrenome("Morgan");

        System.out.println("Nome: " + hospede2.getNome());
        System.out.println("Sobrenome: " + hospede2.getSobrenome());
    }
}