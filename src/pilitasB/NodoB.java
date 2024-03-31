package pilitasB;

public class NodoB {
    String matricula;
    String nombre;
    int cuatrimestre;
    NodoB sig;    // Linea de oro
    
    public NodoB(){
    }

    public NodoB(String matricula, String nombre, int cuatrimestre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.sig = null;
    }

    public NodoB(NodoB reg) {
        this.matricula = reg.matricula;
        this.nombre = reg.nombre;
        this.cuatrimestre = reg.cuatrimestre;
        this.sig = null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public NodoB getSig() {
        return sig;
    }

    public void setSig(NodoB sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo [matricula=" + matricula + ", nombre=" + nombre + ", cuatrimestre=" + cuatrimestre + ", sig=" + sig
                + "]";
    }

    

}
