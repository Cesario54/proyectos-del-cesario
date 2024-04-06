package calculadora;
import calculadora.pila.Pila;

public class Operaciones {
    private static double pushPila(String valor){
        double num;
        valor=valor.replaceAll(" ", "");
        num=Double.valueOf(valor);
        return num;
    }

    private static Pila operacionesBasicas(String operacion, Pila valores){
        double B=valores.pop();
        double A=valores.pop();
        double C;
        switch (operacion.charAt(0)) {
            case '+':C=A+B;
                break;
            case '-':C=A-B;
                break;
            case '*':C=A*B;
                break;
            case '/':C=A/B;
                break;
            case '√':if(A==0)
                        C=Math.sqrt(B);
                    else
                        C=Math.pow(B,(1/A));
                break;
            default :C=Math.pow(A,B);
                break;
        }
        valores.push(C);
        return valores;
    }

    public static Pila operacionesTrigonometricas(String ecuacion, Pila valores){
        double A=valores.pop();
        double C;
        double radianes=Math.toRadians(A);
        if(ecuacion.charAt(0)=='s'&&ecuacion.charAt(1)=='i'&&ecuacion.charAt(2)=='n'){
            C=Math.sin(radianes);
        }else if(ecuacion.charAt(0)=='c'&&ecuacion.charAt(1)=='o'&&ecuacion.charAt(2)=='s'){
            C=Math.cos(radianes);
        }else{
            C=Math.tan(radianes);
        }
        valores.push(C);
        return valores;
    }

    public static Pila operacionesATrigonometricas(String ecuacion, Pila valores){
        double B=valores.pop();
        double A=valores.pop();
        double C;
        if(ecuacion.charAt(0)=='a'&&ecuacion.charAt(1)=='s'&&ecuacion.charAt(2)=='i'&&ecuacion.charAt(3)=='n'){
            C=Math.asin(A/B);
        }else if(ecuacion.charAt(0)=='a'&&ecuacion.charAt(1)=='c'&&ecuacion.charAt(2)=='o'&&ecuacion.charAt(3)=='s'){
            C=Math.acos(A/B);
        }else{
            C=Math.atan(A/B);
        }
        C=Math.toDegrees(C);
        valores.push(C);
        return valores;
    }

    public static Pila logaritmoyLogaritmoNatural(String ecuacion, Pila valores){
        double A=valores.pop();
        double C;
        if(ecuacion.charAt(0)=='l'&&ecuacion.charAt(1)=='o'&&ecuacion.charAt(2)=='g')
            C=Math.log10(A);
        else
            C=Math.log(A);
        valores.push(C);
        return valores;
    }
}
