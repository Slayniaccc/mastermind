public class mastermind {

    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        boolean running = true;

        while (running) {
            int mode = selectMode();
            System.out.println("Selected mode: " + mode);
            running = false;
        }
    }

    private static int selectMode() {
        System.out.println("Default mode selected");
        return 1;
    }
}