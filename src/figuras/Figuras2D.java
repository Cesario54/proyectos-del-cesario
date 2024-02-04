package figuras;

public class Figuras2D{
    int[] posicion=new int[2];
    private String color;

    public Figuras2D (int posicion[], String color){
        this.posicion[0]=posicion[0];
        this.posicion[1]=posicion[1];
        this.color=color;
    }

    public String getcolor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int[] getPosicion(){
        return posicion;
    }

    public void setPosicion(int[] posicion){
        this.posicion=posicion;
    }

    @Override
    public String toString(){
        return "Figura [posicion("+posicion[0]+","+posicion[1]+") \ncolor="+color+"]";
    }
}