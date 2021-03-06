public class Rectangulo extends Figura implements Comparable<Figura>{
    private double base;
    private double altura;
    private int lados=4;
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    public double calcularArea(){
        return base*altura;
    }
    public int getLados(){
        return lados;
    }
    @Override
    public int compareTo(Figura pfigComparar){
        double areaPorComparar = pfigComparar.calcularArea();
        double miArea = this.calcularArea();

        if ((miArea == areaPorComparar) && (this.getLados() == pfigComparar.getLados())){
            return 0;
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        return -1;
    }
    
}
