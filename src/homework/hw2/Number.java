public class Number {
    public static void main(String[] args) {
        positiveOrNot(8);
    }

    public static void positiveOrNot(int num) {
        if (num <= 0){
            System.out.println(num + " isn't positive");
            return;
        }
        if (num%2 != 0) {
            System.out.println(num + " isn't even");
            return;
        }
        System.out.println(num + " is positive even");
    }
}
