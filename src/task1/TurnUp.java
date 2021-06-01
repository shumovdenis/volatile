package task1;

public class TurnUp extends Thread{
    private Toy toy;
    private final static int NUMBER_OF_STARTS = 3;
    private static final int SLEEP_TIME = 1000;

    public TurnUp(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        for (int i =0; i <= NUMBER_OF_STARTS; i++) {
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toy.turnUp();
        }
    }
}
