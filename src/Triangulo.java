public class Triangulo extends Figura implements Comparable<Figura>{
    private double base;
    private double altura;
    private int lados=3;

    public Triangulo(double pbase, double paltura){
        base = pbase;
        altura = paltura;
    }
    public double calcularArea(){
        return (base*altura)/2;
    }
    public int getLados(){
        return lados;
    }
    @Override
    public int compareTo(Figura figComparar){
        double miArea = this.calcularArea();
        double areaComparar = figComparar.calcularArea();

        if (miArea == areaComparar && this.getLados() == figComparar.getLados()){
            return 0;
        }
        else if (miArea > areaComparar){
            return 1;
        }
        return -1;
    }
}
