package calculadora.pila;

public class Pila {
    Nodo top=null;

    public void push(double valor){
        Nodo nuevo= new Nodo(valor);
        nuevo.sig=top;
        top=nuevo;
    }

    public boolean isEmpty() {
        boolean r = false;
        if (top == null) {
            r = true;
        }
        return r;
    }

    public double pop(){
        Nodo actual = null;
        if ( !isEmpty()) {
            actual = top;
            top = top.sig;
            actual.sig = null;
        }else
            return 0;
        return actual.valor;
    }

    @Override
    public String toString(){
        return "pila [top="+top+"]";
    }
}
