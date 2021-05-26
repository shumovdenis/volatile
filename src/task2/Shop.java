package task2;

import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread{
    private final static int CASHBOX_SIZE = 5;
    private final static int MAX_PRICE = 10;
    private int[] cashbox = new int[CASHBOX_SIZE];
    static LongAdder shopSum = new LongAdder();
    static LongAdder totalSum = new LongAdder();


    public int[] makeCash() {
        for (int i = 0; i < CASHBOX_SIZE; i++) {
            Random rnd = new Random();
            cashbox[i] = rnd.nextInt(MAX_PRICE);
        }
        return cashbox;
    }

    public long proceeds() {
        for (int i = 0; i < cashbox.length; i++) {
            shopSum.add(cashbox[i]);
        }
        return shopSum.sum();
    }

    @Override
    public void run() {
        makeCash();
        System.out.println("Касса зкарыта у " + Thread.currentThread().getName());
        totalSum.add(proceeds());
        System.out.println("Сумма: " + shopSum);
    }

}
