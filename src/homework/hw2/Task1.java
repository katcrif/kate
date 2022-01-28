
package homework.hw2;
public class Task1 {
    public static void main(String[] args) {
        double a = 4.67;
        double b = -8.3;
        double c = -2.9;
        System.out.println(a + " " + b + " " +c);
        System.out.println(module(a, b, c));
    }
    public static double module(double x, double y, double z) {
       x = x > 0 ? x : -x;
       y = y > 0 ? y : -y;
       z = z > 0 ? z : -z;
       if (x < y && x < z) {
           return x;
       } else if(y < x && y < z) {
           return y;
        }
       return z;
    }
}
