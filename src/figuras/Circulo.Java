package figuras;

public class Circulo extends Figuras2D{
    int radio;
    public Circulo(int posicion[], String color, int radio){
        super(posicion[],color);
        this.radio=radio;
    }

    public int area(){
        return (3.1416*(radio*radio));
    }

    public int getRadio(){
        return radio;
    }

    public void set Radio(int radio){
        this.radio=radio;
    }

    @Override
    public String toString(){
        String a =super.toString;
        return "Circulo [Radio="+radio+" ,Area="+area+"]";
    }
}