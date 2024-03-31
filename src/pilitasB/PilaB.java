package pilitasB;

public class PilaB {
    NodoB top = null;


    public void push(String id, String nombre, int cuatri) {
        NodoB nuevo = new NodoB(id, nombre, cuatri);
        nuevo.sig = top;
        top = nuevo;
    }

    public void push(NodoB reg) {
        NodoB nuevo = new NodoB(reg);
        nuevo.sig = top;
        top = nuevo;
    }

    public void show(){
        NodoB actual = top;
        while (actual != null) {
            System.out.println(actual.nombre);
            actual = actual.sig;   // linea de oro
        }
        System.out.println("");
    }

    public int size() {
        int n = 0;
        NodoB actual = top;
        while (actual != null) {
            actual = actual.sig;   // linea de oro
            n++;
        }
        return n;
    }

    public boolean isExist(String nombre) {
        boolean answer = false;
        NodoB actual = top;
        while (actual != null) {
            if (actual.getNombre() == nombre) {
                answer= true;
                break;
            }
            actual = actual.sig;
        }    
        return answer;
    }


    @Override
    public String toString() {
        return "Pila [top=" + top + "]";
    }
    
    
}
