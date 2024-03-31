package calculadora;

import calculadora.pila.Nodo;
import calculadora.pila.Pila;

public class TestCalculadora {
    public static void main(String[] args) {
        Nodo reg=new Nodo();
        Pila valores=new Pila();

        valores.push(8);
        valores.push(10);
        valores.push(6);

        valores.pop();
    }
}
