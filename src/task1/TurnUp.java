package task1;

public class TurnUp extends Thread{
    private Toy toy;

    public TurnUp(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        for (int i =0; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toy.turnUp();
        }
    }
}
