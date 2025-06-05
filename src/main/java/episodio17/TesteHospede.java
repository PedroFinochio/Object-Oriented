package episodio17;

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

        Hospede hospede3 = new Hospede("Debra");
        hospede3.setSobrenome("Morgan");

        System.out.println("Nome: " + hospede3.getNome());
        System.out.println("Sobrenome: " + hospede3.getSobrenome());

        Hospede hospede4 = new Hospede("Brian", "Moser");
        System.out.println("Nome: " + hospede4.getNome());
        System.out.println("Sobrenome: " + hospede4.getSobrenome());

        Hospede hospede5 = new Hospede("Lila","West");
        String nomeHospede5 = hospede5.getNome();
        String sobrenomeHospede5 = hospede5.getSobrenome();
        System.out.println("Nome: " + nomeHospede5);
        System.out.println("Sobrenome: " + sobrenomeHospede5);
    }
}