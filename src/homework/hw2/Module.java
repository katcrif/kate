public class Module {
    public static void main(String[] args) {
        double a = 4.67;
        double b = -8.3;
        double c = -2.9;
        System.out.print(a + " " + b + " " +c);
        System.out.println("\n" + module(Math.abs(a), Math.abs(b), Math.abs(c)));
    }
    public static double module(double x, double y, double z) {
       double min = (Math.abs(x) < Math.abs(y) && Math.abs(y) < Math.abs(z)) ? Math.abs(x) : ((Math.abs(y) < Math.abs(z)) ? Math.abs(y) : Math.abs(z));
        return min;
    }
}
