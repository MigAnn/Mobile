public class Main {
    public static void main(String[] args) {
        int score = 100;
        int refill = 1000;
        int sum = score + refill;
        int bonus = refill / 100;
        int change = bonus + sum;

        if (refill < 1000) {
            System.out.println("Ваш счёт пополнен на : " + sum);
        } else {
            System.out.println("Ваш счёт пополнен на : " + change);
        }

    }
}