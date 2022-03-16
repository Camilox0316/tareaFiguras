import java.lang.Math;
public class Circulo extends Figura implements Comparable<Figura> {
    private double radio;
    private double pi = 3.1416;
    private int lados=1;

    public Circulo(double pRadio){
        radio = pRadio;
    }
    public double calcularArea(){
        return pi*(Math.pow(radio, 2));
    }
    public int getLados(){
        return lados;
    }
    @Override
    public int compareTo(Figura pfigComparar){
        double miArea = this.calcularArea();
        double areaComparar = pfigComparar.calcularArea();

        if (miArea == areaComparar && this.getLados() == pfigComparar.getLados()){
            return 0;
        }
        else if (miArea > areaComparar){
            return 1;
        }
        return -1;
    }
}
