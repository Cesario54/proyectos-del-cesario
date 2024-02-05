package figuras;

public class Rectangulo extends Figuras2D{
    int lados[]=new int[2];

    public Rectangulo (int posicion[], String color, int lados[]){
        super(posicion[], color);
        this.posicion=posicion;
    }

    private int area (){
        return (lados[0]*lados[1]);
    }

    public int getLados(){
        return lados[];
    }

    public void setLados(int lados[]){
        this.lados=lados;
    }

    @Override
    public String toString(){
        String a=super.toString;
        return a+" : Rectangulo [Base="+lados[0]+", Altura="+lados[1]+", Area="+area+"]";
    }
}