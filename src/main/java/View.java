import java.sql.SQLOutput;
import java.util.Scanner;

public class View {
    private int receivedValue;
    private int totalAnswers;

    Scanner sc = new Scanner(System.in);

    public void inputRealAnswer(){
        System.out.print("정답 입력 : ");
        totalAnswers = sc.nextInt();
    }

    public void inputYourAnswer(){
        System.out.println("추측 값 입력 : ");
        receivedValue = sc.nextInt();
    }

    public void outputAnswer(int firstDigitAnswer, int secondDigitAnswer, int thirdDigitAnswer){

    }


}
