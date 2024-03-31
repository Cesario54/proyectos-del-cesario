package calculadora.pila;

public class NodoO {
    private String operador;
    private int prioridad;
    NodoO sig = null;

    public NodoO(String operador, int prioridad){
        this.operador = operador;
        this.prioridad = prioridad;
        this.sig = null;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getOperador() {
        return operador;
    }
}
