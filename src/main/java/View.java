import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public int showMainMenu() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 0을 입력하세요 : ");
        return sc.nextInt();
    }

    public String inputRealAnswer() {
        System.out.print("정답 입력 : ");
        return sc.next();
    }

    public void showStart() {
        System.out.println("\n########## 게임 시작 ##########\n");
    }

    public String inputYourAnswer() {
        System.out.println("추측 값 입력 : ");
        return sc.next();
    }

    public void showError(int numberOfDigit) {
        System.out.println("1부터 9까지 서로 다른 수로 이루어진 " + numberOfDigit + "자리 수를 입력하여 주십시오.\n");
    }

    public void showResult(int attempts, int ball, int strike) {
        System.out.println(attempts + ". " + ball + "볼 " + strike + "스트라이크\n");
    }

    public void showSuccess(int attempts, int numberOfDigit) {
        System.out.println(attempts + "번의 시도 만에 " + numberOfDigit + "개의 숫자를 모두 맞히셨습니다!\n");
    }


    public void showEnd() {
        System.out.println("\n########## 게임 종료 ##########\n");
    }
}