import java.util.HashSet;

public class Model {
    private final int numberOfDigits;

    public Model(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    public boolean isValidAnswer(String answer) {
        if (answer.length() != numberOfDigits) return false;

        HashSet<Character> checkRedundancy = new HashSet<>();
        for (char c : answer.toCharArray()) {
            if (c < '1' || c > '9') return false;
            checkRedundancy.add(c);
        }
        return checkRedundancy.size() == numberOfDigits;
    }

    public int[] calculateResult(String receivedAnswer, String realAnswer) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            if (receivedAnswer.charAt(i) == realAnswer.charAt(i)) {
                strike++;
            } else if (realAnswer.contains(String.valueOf(receivedAnswer.charAt(i)))) {
                ball++;
            }
        }
        return new int[]{strike, ball};
    }

    public boolean finalResult(int strike) {
        return strike == numberOfDigits;
    }
}