public class Triangulo extends Figura implements Comparable<Triangulo>{
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
    public int compareTo(Triangulo triComparar){
        double miArea = this.calcularArea();
        double areaComparar = triComparar.calcularArea();

        if (miArea == areaComparar && this.getLados() == triComparar.getLados()){
            return 0;
        }
        else if (miArea > areaComparar){
            return 1;
        }
        return -1;
    }
}
