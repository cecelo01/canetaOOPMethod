package br.canetaoppmethod;

/**
 *
 * @author Marce
 */
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Caneta tampada");
        } else {
            System.out.println("Rabisco");
        }
    }
    
    void status(){
        System.out.println("Caneta de cor: "+this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println("Modelo: "+ this.modelo);
    }

    void tampar() {
        tampada = true;
        System.out.println("Caneta tampada");
    }
    
    void destampar(){
        tampada = false;
        System.out.println("Caneta destampada");
    }
}


