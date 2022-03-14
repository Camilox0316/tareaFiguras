import java.lang.Math;
public class Circulo extends Figura implements Comparable<Circulo> {
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
    public int compareTo(Circulo pcirComparar){
        double miArea = this.calcularArea();
        double areaComparar = pcirComparar.calcularArea();

        if (miArea == areaComparar && this.getLados() == pcirComparar.getLados()){
            return 0;
        }
        else if (miArea > areaComparar){
            return 1;
        }
        return -1;
    }
}
