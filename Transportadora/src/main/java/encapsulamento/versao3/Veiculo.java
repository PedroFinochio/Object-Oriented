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

    public boolean adicionarCaixa(double pesoKg){
        double pesoN = quilosParaNewtons(pesoKg);
        if(this.carga + pesoN <= cargaMaxima && pesoN >= 0) {
            this.carga += pesoN;
            return true;
        }
       return false;
    }

    private double newtonsParaQuilos(double pesoN){
        return pesoN / 9.8;
    }

    private double quilosParaNewtons(double pesoKg){
        return pesoKg * 9.8;
    }
    public double getCargaKg() {
        return newtonsParaQuilos(this.carga);
    }

}
