public class Main {
    public static void main(String[] args) {
        System.out.println("Chekh Kateryna");

        int symbols = 8;

        if (symbols > 7) {
            System.out.println("more than 7");
        } else if(symbols < 7){
            System.out.println("less than 7");
        } else {
            System.out.println("There are 7 symbols");
        }

        int step, meaning;
        for (step = 0, meaning = 5; step <= 10; step++, meaning = meaning + 2) {
            System.out.println("Шаг " + step + ", значение " + meaning);

        }
    }
}

