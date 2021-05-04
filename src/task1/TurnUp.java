package task1;

public class TurnUp extends Thread{
    private Toy toy;
    private int numberOfStarts = 3;

    public TurnUp(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        for (int i =0; i <= numberOfStarts; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toy.turnUp();
        }
    }
}
