package episodio1;

public class Hospede {

    private String nome;
    private String sobrenome;

    public Hospede() {
    }

    public Hospede(String nome) { //quando voce escreve um novo contsrutor, voce perde o construtor default
        this.nome = nome;
    }

    public Hospede(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}