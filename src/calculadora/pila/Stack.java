package calculadora.pila;

public class Stack {
    NodoO top = null;

    public void push(String operador, int prioridad){
        NodoO nuevo= new NodoO(operador, prioridad);
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

    public String pop(){
        NodoO actual = null;
        if ( !isEmpty()) {
            actual = top;
            top = top.sig;
            actual.sig = null;
        }
        return actual.getOperador();
    }

    public int pip(){
        NodoO actual=top;
        return actual.getPrioridad();
    }
} 

