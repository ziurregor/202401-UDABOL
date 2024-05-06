import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long areaPasto = scanner.nextLong();
        double longitudCerca = calcularLongitudCerca(areaPasto);
        System.out.printf("%.10f\n", longitudCerca);
        scanner.close();
    }
    
    public static double calcularLongitudCerca(long areaPasto) {
        return Math.sqrt(areaPasto) * 4;
    }
}
