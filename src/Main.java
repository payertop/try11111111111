

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1001;

        int percent;
        if (deposit >= 1000) {
            percent = 1;
        } else {
            percent = 0;

        }
        int bonus = deposit / 100 * percent;
        int total = deposit + bonus;

        System.out.println(total);

    }
    }

