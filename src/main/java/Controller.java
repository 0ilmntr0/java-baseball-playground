public class Controller {
    static final int numberOfDigits = 3;
    private static Model model; //final 써야됨?
    private static View view;

    public Controller() {
        model = new Model(numberOfDigits);
        view = new View();
    }

    public static void main(String[] args) {
        new Controller();

        while (view.showMainMenu() != 0) {
            String realAnswer;
            String receivedAnswer;
            int numberOfChallenges = 1;

            while (true) {
                realAnswer = view.inputRealAnswer();
                if (model.isValidAnswer(realAnswer)) {
                    break;
                }
                view.showError(numberOfDigits);
            }

            view.showStart();

            while (true) {
                receivedAnswer = view.inputYourAnswer();
                if (!model.isValidAnswer(receivedAnswer)) {
                    view.showError(numberOfDigits);
                    continue;
                }

                int[] result = model.calculateResult(receivedAnswer, realAnswer);

                if (model.finalResult(result[0])) {
                    view.showSuccess(numberOfChallenges, numberOfDigits);
                    break;
                }
                view.showResult(numberOfChallenges, result[1], result[0]);
                numberOfChallenges++;
            }
        }
        view.showEnd();
    }
}
