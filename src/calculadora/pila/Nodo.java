package calculadora.pila;

public class Nodo {
    double valor;
    Nodo sig;
    public Nodo(){

    }
    public Nodo(double valor) {
        this.valor=valor;
        this.sig=null;
    }
    
    public Nodo(Nodo reg){
        this.valor=reg.valor;
        this.sig=null;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Nodo [valor=" + valor + ", sig=" + sig + "]";
    }
}
