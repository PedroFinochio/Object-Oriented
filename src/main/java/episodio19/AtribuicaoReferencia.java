package episodio19;

public class AtribuicaoReferencia {

    static Hospede hospede1 = new Hospede("Lumen");
    static Hospede hospede2 = hospede1;


    static void mudaHospede(Hospede hospede2){
        hospede2.setNome("Thomas");
        System.out.println("Hospede 1: " + hospede1.getNome());
    }

    public static void main(String[] args) {

        System.out.println("Hospede 1: " + hospede1.getNome());
        System.out.println("Hospede 2: " + hospede2.getNome());

        hospede1.setNome("Isaak");

        System.out.println("Hospede 1: " + hospede1.getNome());
        System.out.println("Hospede 2: " + hospede2.getNome());

        mudaHospede(hospede1);
    }

}
