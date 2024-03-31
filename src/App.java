import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add(3);
        a.add(0,2);
        a.add(1);
        System.out.println(a);

        
        String ecuacion="1 + 2";
        ecuacion="( "+ecuacion+" )";
        String[] yo={"(","1","+","2",")"};
        String[] ecuacionIn=ecuacion.split(" ");
        if (ecuacionIn[0]=="(")
            System.out.println("hola mundo");
        String algo="";
        algo+="(";
        //for (int i = 0; i < ecuacionIn[0].length(); i++) {
        //    algo+=ecuacionIn[0].charAt(i);
        //}
        if (algo=="("){
            System.out.println("hola mundo");
        }
    }
}
