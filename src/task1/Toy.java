package task1;

public class Toy {
    private volatile boolean status;

    public void turnUp () {
        if(!status) {
            System.out.println("Up");
            status = true;
        }

    }

    public void turnDown () {
        if(status) {
            System.out.println("Down");
            status = false;
        }
    }

    public boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
}
