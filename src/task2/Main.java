package task2;

import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LongAdder totalSum = new LongAdder();

        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Shop shop3 = new Shop();

        Thread threadShop1 = new Thread(null, shop1, "Shop1");
        Thread threadShop2 = new Thread(null, shop2, "Shop2");
        Thread threadShop3 = new Thread(null, shop3, "Shop3");

        threadShop1.start();
        threadShop2.start();
        threadShop3.start();

        threadShop1.join();
        threadShop2.join();
        threadShop3.join();

        System.out.println(Shop.totalSum.sum());
    }
}
