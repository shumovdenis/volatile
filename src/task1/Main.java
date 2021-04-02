package task1;

public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy();
        TurnUp turnUp = new TurnUp(toy);
        TurnDown turnDown = new TurnDown(toy);

        Thread up = new Thread(null, turnUp, "1");
        Thread down = new Thread(null, turnDown, "2");


        up.start();
        down.setDaemon(true);
        down.start();
    }
}
