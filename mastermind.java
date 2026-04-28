import java.util.*;

public class mastermind {

    private static Random random = new Random();
    private static boolean hintUsed = false;
    private static int playerScore = 0;
private static int computerScore = 0;

    public static void main(String[] args) {
        runGame();
    }

    private static void runGame() {
        boolean running = true;

        while (running) {
            int mode = selectMode();
            playRound(mode);
            running = postGame();
        }
    }
    private static boolean postGame() {
    System.out.println("Score - Player: " + playerScore + " | Computer: " + computerScore);
    System.out.println("Game finished.");
    return false;
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

           String feedback = generateFeedback(secret, guess);
    System.out.println("Feedback: " + feedback);

    if (feedback.equals("+".repeat(codeLength))) {
        won = true;
        break;
    }
if (!hintUsed && tries == 2) {
    useHint(secret);
}
            tries++;
        }

       if (won) {
    System.out.println("You win!");
    playerScore++;
} else {
    System.out.println("You lose! Code was: " + new String(secret));
    computerScore++;
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
    char[] guess = new char[length];

    for (int i = 0; i < length; i++) {
        guess[i] = detectColour();
    }

    return guess;
}
    private static char detectColour() {
    return 'R';
}

private static char mapToColour(int r, int g, int b) {
    return 'R';
}
private static String generateFeedback(char[] secret, char[] guess) {
    int correctPosition = 0;
    int correctColour = 0;

    boolean[] secretUsed = new boolean[secret.length];
    boolean[] guessUsed = new boolean[guess.length];

    for (int i = 0; i < secret.length; i++) {
        if (guess[i] == secret[i]) {
            correctPosition++;
            secretUsed[i] = true;
            guessUsed[i] = true;
        }
    }

    for (int i = 0; i < guess.length; i++) {
        if (!guessUsed[i]) {
            for (int j = 0; j < secret.length; j++) {
                if (!secretUsed[j] && guess[i] == secret[j]) {
                    correctColour++;
                    secretUsed[j] = true;
                    break;
                }
            }
        }
    }

    return "+".repeat(correctPosition) + "-".repeat(correctColour);
}
}