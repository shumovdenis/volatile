package task2;

import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread{
    private final static int CASHBOX_SIZE = 5;
    private final static int MAX_PRICE = 10;
    private int[] cashbox = new int[CASHBOX_SIZE];
    Report report;
    private int checkSumShop;

    public Shop (Report report) {
        this.report = report;
    }

    public int[] makeCash() {
        for (int i = 0; i < CASHBOX_SIZE; i++) {
            Random rnd = new Random();
            cashbox[i] = rnd.nextInt(MAX_PRICE);
        }
        return cashbox;
    }

    private void sendDataToReport() {
        for (int i = 0; i < cashbox.length; i++) {
            report.addCash(cashbox[i]);
            checkSumShop += cashbox[i];
        }
    }

    @Override
    public void run() {
        makeCash();
        sendDataToReport();
        System.out.println("Касса зкарыта у " + Thread.currentThread().getName());
        System.out.println("Сумма " + checkSumShop);
    }
}
