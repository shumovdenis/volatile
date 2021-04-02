package task2;

import java.util.Random;

public class Shop extends Thread{
    private final int CASHBOX_SIZE = 5;
    private final int MAX_PRICE = 10;
    private int[] cashbox = new int[CASHBOX_SIZE];
    int sum;

    public int[] makeCash() {
        for (int i = 0; i < CASHBOX_SIZE; i++) {
            Random rnd = new Random();
            cashbox[i] = rnd.nextInt(MAX_PRICE);
        }
        return cashbox;
    }

    public int proceeds() {
        for (int i = 0; i < cashbox.length; i++) {
            sum += cashbox[i];
        }
        return sum;
    }

    @Override
    public void run() {
        makeCash();
        System.out.println("Касса зкарыта у " + Thread.currentThread().getName());
        System.out.println("Сумма: " + proceeds());
    }

    public int getSum() {
        return sum;
    }

    public void print() {
        for (int i = 0; i <= CASHBOX_SIZE - 1; i++) {
            System.out.print(cashbox[i] + " ");
        }
    }


}
