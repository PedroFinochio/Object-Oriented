package episodio17;

public class TesteIniciaVariaveis {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public void imprimeVariaveis(){
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
    }

    public static void main(String[] args) {

        TesteIniciaVariaveis teste = new TesteIniciaVariaveis();

        teste.imprimeVariaveis();
    }
}
