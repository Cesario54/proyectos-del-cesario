package calculadora;
import calculadora.infixToPostfix.InfixToPostfix;
import calculadora.pila.*;

public class Claculadora {
    public static void main(String[] args) {
        InfixToPostfix ecuacionIn=new InfixToPostfix();
        //String[] ecuacion=ecuacionIn.ecuacionPostfix("5 * ( 6 + 2 ) - 12 √­ 4");
        String[] ecuacion=ecuacionIn.ecuacionPostfix("1 / 2");
        //String[] ecuacion={"","","","","","","","","","","","","","","","",""};
        Pila valores=new Pila();
        
        for (int i = 0; i < ecuacion.length; i++) {

            if(ecuacion[i].charAt(0)=='+'||ecuacion[i].charAt(0)=='-'||ecuacion[i].charAt(0)=='/'||ecuacion[i].charAt(0)=='*'||ecuacion[i].charAt(0)=='^'||ecuacion[i].charAt(0)=='√'){
                valores=operacionesBasicas(ecuacion[i], valores);
            }else if(ecuacion[i].charAt(0)=='s'&&ecuacion[i].charAt(1)=='i'&&ecuacion[i].charAt(2)=='n'||ecuacion[i].charAt(0)=='c'&&ecuacion[i].charAt(1)=='o'&&ecuacion[i].charAt(2)=='s'||ecuacion[i].charAt(0)=='t'&&ecuacion[i].charAt(1)=='a'&&ecuacion[i].charAt(2)=='n'){
                valores=operacionesTrigonometricas(ecuacion[i], valores);
            }else if(ecuacion[i].charAt(0)=='a'&&ecuacion[i].charAt(1)=='s'&&ecuacion[i].charAt(2)=='i'&&ecuacion[i].charAt(3)=='n'||ecuacion[i].charAt(0)=='a'&&ecuacion[i].charAt(1)=='c'&&ecuacion[i].charAt(2)=='o'&&ecuacion[i].charAt(3)=='s'||ecuacion[i].charAt(0)=='a'&&ecuacion[i].charAt(1)=='t'&&ecuacion[i].charAt(2)=='a'&&ecuacion[i].charAt(3)=='n'){
                valores=operacionesATrigonometricas(ecuacion[i], valores);
            }else if(ecuacion[i].charAt(0)=='l'&&ecuacion[i].charAt(1)=='o'&&ecuacion[i].charAt(2)=='g'||ecuacion[i].charAt(0)=='l'&&ecuacion[i].charAt(1)=='n'){
                valores=logaritmoyLogaritmoNatural(ecuacion[i], valores);
            }else{
                valores.push(pushPila(ecuacion[i]));
            }
        }
        System.out.println(String.format("%.4f", valores.pop()));
    }

}
