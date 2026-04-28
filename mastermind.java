public class mastermind {

    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        boolean running = true;

        while (running) {
            int mode = selectMode();
            playRound(mode); // NEW LINE ADDED
            running = false;
        }
    }

    private static int selectMode() {
        System.out.println("Default mode selected");
        return 1;
    }

    // NEW METHOD
    private static void playRound(int mode) {
        int codeLength = 4;
        int attempts = 6;

        System.out.println("Round started");
        System.out.println("Code length: " + codeLength);
        System.out.println("Attempts: " + attempts);
    }
}