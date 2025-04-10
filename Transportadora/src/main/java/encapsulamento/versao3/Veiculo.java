package encapsulamento.versao3;

public class Veiculo {

    private double carga; //armazena o peso em Newtons
    private double cargaMaxima; //armazena o peso em Newtons
    public Veiculo(double cargaMaxima){
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        if(this.carga + peso <= cargaMaxima) {
            this.carga += peso;
            return true;
        }
       return false;
    }

    private double newtonsParaQuilos(double peso){
        peso = peso * 9.8;
        return peso;
    }

    private double quilosParaNewtons(double peso){
        peso = 9.8 * newtonsParaQuilos(peso);
        return peso;
    }
}
