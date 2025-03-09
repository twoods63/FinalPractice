public class Monster extends Thread {
    int x_location = 0;
    int y_location = 0;

    public void run() {
        x_location += 100;
        y_location += 200;
    }

    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster();

        monster1.start();
        monster2.start();
    }
}
