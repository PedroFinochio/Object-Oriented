package episodio20;

import episodio1.Hospede;

public class TesteHospede {

    public static void main (String [] args){

        Hospede hospede = criarHospede("Pedro","Finochio");
        exibirHospede(hospede);

        Hospede hospede2 = criarHospede("Dexter","Morgan");
        exibirHospede(hospede2);

        Hospede hospede3 = criarHospede("Debra", "Morgan");
        exibirHospede(hospede3);

        Hospede hospede4 = criarHospede("Brian","Moser");
        exibirHospede(hospede4);

        Hospede hospede5 = criarHospede("Lila","West");
        exibirHospede(hospede5);
    }

    public static Hospede criarHospede(String nome, String sobrenome){
        return new Hospede(nome,sobrenome);
    }

    public static void exibirHospede(Hospede h1){
        System.out.println("Nome: " + h1.getNome());
        System.out.println("Sobrenome: " + h1.getSobrenome());
    }
}