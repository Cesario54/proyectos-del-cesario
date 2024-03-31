package calculadora;
import calculadora.infixToPostfix.InfixToPostfix;
import calculadora.pila.*;

public class Claculadora {
    public static void main(String[] args) {
        InfixToPostfix ecuacionIn=new InfixToPostfix();
        //String[] ecuacion=ecuacionIn.ecuacionPostfix("5 * ( 6 + 2 ) - 12 √­ 4");
        String[] ecuacion=ecuacionIn.ecuacionPostfix("asin 1 2");
        //String[] ecuacion={"","","","","","","","","","","","","","","","",""};
        Pila valores=new Pila();
        
        for (int i = 0; i < ecuacion.length; i++) {

            if(ecuacion[i].charAt(0)=='+'||ecuacion[i].charAt(0)=='-'||ecuacion[i].charAt(0)=='/'||ecuacion[i].charAt(0)=='*'||ecuacion[i].charAt(0)=='^'||ecuacion[i].charAt(0)=='√'){
                valores=operacionesBasicas(ecuacion[i], valores);
            }else if(ecuacion[i].charAt(0)=='s'&&ecuacion[i].charAt(1)=='i'&&ecuacion[i].charAt(2)=='n'||ecuacion[i].charAt(0)=='c'&&ecuacion[i].charAt(1)=='o'&&ecuacion[i].charAt(2)=='s'||ecuacion[i].charAt(0)=='t'&&ecuacion[i].charAt(1)=='a'&&ecuacion[i].charAt(2)=='n'){
                valores=operacionesTrigonometricas(ecuacion[i], valores);
            }else if(ecuacion[i].charAt(0)=='a'&&ecuacion[i].charAt(1)=='s'&&ecuacion[i].charAt(2)=='i'&&ecuacion[i].charAt(3)=='n'||ecuacion[i].charAt(0)=='a'&&ecuacion[i].charAt(1)=='c'&&ecuacion[i].charAt(2)=='o'&&ecuacion[i].charAt(3)=='s'||ecuacion[i].charAt(0)=='a'&&ecuacion[i].charAt(1)=='t'&&ecuacion[i].charAt(2)=='a'&&ecuacion[i].charAt(3)=='n'){
                valores=operacionesATrigonometricas(ecuacion[i], valores);
            }else{
                valores.push(pushPila(ecuacion[i]));
            }
        }
        System.out.println(valores.pop());
    }

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
}
