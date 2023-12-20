import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int contribution = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }
}
