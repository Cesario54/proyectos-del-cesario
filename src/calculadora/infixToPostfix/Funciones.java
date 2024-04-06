package calculadora.infixToPostfix;

public class Funciones {
    public static boolean funciones(String exprecion){
        boolean vandera=false;
        if(trigonometricas(exprecion))
            vandera=true;
        else if(logaritmicas(exprecion))
            vandera=true;
        return vandera;
    }

    private boolean trigonometricas(String exprecion){
        boolean vandera=false;
        if(exprecion.charAt(0)=='s'&&exprecion.charAt(1)=='i'&&exprecion.charAt(2)=='n'){
            vandera=true;
        }else if(exprecion.charAt(0)=='c'&&exprecion.charAt(1)=='o'&&exprecion.charAt(2)=='s'){
            vandera=true;
        }else if(exprecion.charAt(0)=='t'&&exprecion.charAt(1)=='a'&&exprecion.charAt(2)=='n'){
            vandera=true;
        }else if(exprecion.charAt(0)=='a'&&exprecion.charAt(1)=='s'&&exprecion.charAt(2)=='i'&&exprecion.charAt(3)=='n'){
            vandera=true;
        }else if(exprecion.charAt(0)=='a'&&exprecion.charAt(1)=='c'&&exprecion.charAt(2)=='o'&&exprecion.charAt(3)=='s'){
            vandera=true;
        }else if(exprecion.charAt(0)=='a'&&exprecion.charAt(1)=='t'&&exprecion.charAt(2)=='a'&&exprecion.charAt(3)=='n'){
            vandera=true;
        }
        return vandera;
    }

    private boolean logaritmicas(String exprecion){
        boolean vandera=false;
        if(exprecion.charAt(0)=='l'&&exprecion.charAt(1)=='o'&&exprecion.charAt(2)=='g')
            vandera=true;
        else if(exprecion.charAt(0)=='l'&&exprecion.charAt(1)=='n')
            vandera=true;
        return vandera;
    }
}
