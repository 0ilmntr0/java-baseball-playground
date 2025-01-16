import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static final int numberOfDigit = 3; // 몇 자리수 게임을 할것인가

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            HashSet<Character> checkRedundancy = new HashSet<>();

            System.out.print("게임을 새로 시작하려면 1, 종료하려면 0을 입력하세요 : ");

            int flag = sc.nextInt();
            if (flag == 0) {
                break;
            }
            if (flag != 1) {
                continue;
            }


            String realAnswer;

            while (true) {
                System.out.print("정답 입력 : ");
                realAnswer = sc.next();

                if (realAnswer.length() != numberOfDigit) {
                    System.out.println("1부터 9까지 서로 다른 수로 이루어진 " + numberOfDigit + "자리 수를 입력하여 주십시오.");
                    continue;
                }

                for (int i = 0; i < numberOfDigit; i++) {
                    if (realAnswer.charAt(i) < '1' || realAnswer.charAt(i) > '9') {
                        realAnswer = "0";
                        break;
                    }
                }
                if (realAnswer.equals("0")) {
                    System.out.println("1부터 9까지 서로 다른 수로 이루어진 " + numberOfDigit + "자리 수를 입력하여 주십시오.");
                    continue;
                }


                for (int i = 0; i < numberOfDigit; i++) {
                    checkRedundancy.add(realAnswer.charAt(i));
                }

                if (checkRedundancy.size() != numberOfDigit) {
                    System.out.println("1부터 9까지 서로 다른 수로 이루어진 " + numberOfDigit + "자리 수를 입력하여 주십시오.");
                    checkRedundancy.clear();
                    continue;
                }

                checkRedundancy.clear();
                break;
            }


            System.out.println("\n########## 게임 시작 ##########\n");
            int numberOfChallenges = 0;

            while (true) {
                System.out.print("추측 값 입력 : ");
                String receivedAnswer = sc.next();

                if (receivedAnswer.length() != numberOfDigit) {
                    System.out.println("1부터 9까지 서로 다른 수로 이루어진 " + numberOfDigit + "자리 수를 입력하여 주십시오.");
                    continue;
                }


                for (int i = 0; i < numberOfDigit; i++) {
                    if (receivedAnswer.charAt(i) < '1' || receivedAnswer.charAt(i) > '9') {
                        receivedAnswer = "0";
                        break;
                    }
                }
                if (receivedAnswer.equals("0")) {
                    System.out.println("1부터 9까지 서로 다른 수로 이루어진 " + numberOfDigit + "자리 수를 입력하여 주십시오.");
                    continue;
                }


                numberOfChallenges++;

                int ballCnt = 0;
                int strikeCnt = 0;

                for (int i = 0; i < numberOfDigit; i++) {
                    if (receivedAnswer.charAt(i) == realAnswer.charAt(i)) {
                        strikeCnt++;
                    }

                    for (int j = 0; j < numberOfDigit; j++) {
                        if (i == j) {
                            continue;
                        }
                        if (receivedAnswer.charAt(i) == realAnswer.charAt(j)) {
                            ballCnt++;
                        }
                    }
                }


                if (strikeCnt == numberOfDigit) {
                    System.out.println(numberOfChallenges + "번의 시도 만에 " + numberOfDigit + "개의 숫자를 모두 맞히셨습니다!\n");
                    break;
                }

                System.out.println(numberOfChallenges + ". " + ballCnt + "볼 " + strikeCnt + "스트라이크\n");
            }
        }
        System.out.println("게임종료");
    }
}
