package homework.hw2;
public class Task2 {
    public static void main(String[] args) {
        evenOrNot(8);
    }

    public static void evenOrNot(int num) {
        if (num%2 != 0) {
            System.out.println(num + " is odd");
            return;
        }
        System.out.println(num + " is even");
    }
}
