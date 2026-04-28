import java.util.*;

public class mastermind {

    private static Random random = new Random();

    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        boolean running = true;

        while (running) {
            int mode = selectMode();
            playRound(mode);
            running = false;
        }
    }

    private static int selectMode() {
        System.out.println("Default mode selected");
        return 1;
    }

    private static void playRound(int mode) {
        int codeLength = 4;
        int attempts = 6;

        char[] secret = generateCode(codeLength);

        int tries = 0;
        boolean won = false;

        while (tries < attempts && !won) {
            System.out.println("Attempt " + (tries + 1));

            char[] guess = captureGuess(codeLength);

            if (Arrays.equals(secret, guess)) {
                won = true;
                break;
            }

            tries++;
        }

        if (won) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose! Code was: " + new String(secret));
        }
    }

    private static char[] generateCode(int length) {
        char[] colours = {'R','G','B','Y','O','P'};
        List<Character> pool = new ArrayList<>();

        for (char c : colours) pool.add(c);
        Collections.shuffle(pool);

        char[] code = new char[length];
        for (int i = 0; i < length; i++) {
            code[i] = pool.get(i);
        }

        return code;
    }

    private static char[] captureGuess(int length) {
        return new char[length];
    }
}