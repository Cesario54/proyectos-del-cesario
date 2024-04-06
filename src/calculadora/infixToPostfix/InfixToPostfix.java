package calculadora.infixToPostfix;
import java.util.ArrayList;

import calculadora.pila.*;

public class InfixToPostfix {
    Stack operadores=new Stack();
    ArrayList<String> postfix=new ArrayList<>();

    //transforma infix a postfix
    public String[] ecuacionPostfix(String ecuacion){
        ecuacion= "( "+ecuacion+" )";
        String[] ecuacionIn=ecuacion.split(" ");

        for (int i = 0; i < ecuacionIn.length; i++) {
            if (ecuacionIn[i].charAt(0)=='('){
                operadores.push("(",0);
            }else if(ecuacionIn[i].charAt(0)=='+'||ecuacionIn[i].charAt(0)=='-'){
                pop(1, i);
                operadores.push(ecuacionIn[i], 1);
            }else if(ecuacionIn[i].charAt(0)=='*'||ecuacionIn[i].charAt(0)=='/'){
                pop(2, i);
                operadores.push(ecuacionIn[i], 2); 
            }else if(ecuacionIn[i].charAt(0)=='^'||ecuacionIn[i].charAt(0)=='√'){
                pop(3, i);
                operadores.push(ecuacionIn[i], 3);
            }else if(funciones(ecuacionIn[i])){
                operadores.push(ecuacionIn[i], 4);
            }else if(ecuacionIn[i].charAt(0)==')'){
                while(operadores.pip()!=0){
                    postfix.add(operadores.pop());
                }
                operadores.pop();
            }else{
                postfix.add(ecuacionIn[i]);
            }
            
        }
        return arrayToStringA(postfix);
    }
    //pasa de Array list a un Array normal
    private String[] arrayToStringA(ArrayList<String> ecuacionA){
        String[] ecuacionS=new String[ecuacionA.size()];
        for (int i = 0; i < ecuacionA.size(); i++) {
            ecuacionS[i]=ecuacionA.get(i);
        }
        return ecuacionS;
    }

    private void pop(int prioridad, int i){
        while(operadores.pip()>prioridad){
            postfix.add(operadores.pop());
        }
    }
}
