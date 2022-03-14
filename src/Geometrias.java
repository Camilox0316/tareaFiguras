import java.util.Arrays;
public class Geometrias {
    public static void main(String[] args) throws Exception {
        Rectangulo[] rects = new Rectangulo[4];
        rects[0] = new Rectangulo(2.5, 3.0);
        rects[0] = new Rectangulo(1.7, 2.2);
        rects[0] = new Rectangulo(2.8, 3.1);
        rects[0] = new Rectangulo(3.5, 1.2);
        Arrays.sort(rects);
    }
}
