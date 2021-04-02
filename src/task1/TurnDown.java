package task1;

public class TurnDown extends Thread{
    Toy toy;

    public TurnDown(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            toy.turnDown();
        }
    }
}
