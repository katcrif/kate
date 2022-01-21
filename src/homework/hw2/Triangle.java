public class Triangle {
    public static void main(String[] args) {
        double x1 = 3;
        double y1 = 4;
        double x2 = 2;
        double y2 = 1;
        double x3 = 5;
        double y3 = 7;
        System.out.printf("Triangle square is " + "%.2f", (method(x1, y1, x2, y2, x3, y3)));
        System.lineSeparator();
    }

    public static double method(double a1, double b1, double a2, double b2, double a3, double b3) {
        double square = 0;
        double a = Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2));
        double b = Math.sqrt((a1 - a3) * (a1 - a3) + (b1 - b3) * (b1 - b3));
        double c = Math.sqrt((a2 - a3) * (a2 - a3) + (b2 - b3) * (b2 - b3));
        if(a + b <= c || a + c <= b){
            System.out.println("Треугольник не существует");
        } else {
            double p = (a + b + c) / 2.0;
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return (square);
    }
}
