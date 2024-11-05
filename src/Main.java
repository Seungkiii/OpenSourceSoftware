import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("정수를 입력하시오: ");
            int a = sc.nextInt();
            System.out.print("정수를 입력하시오: ");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("b: " + b);
            } else if (a < b) {
                System.out.println("a: " + a);
            } else {
                System.out.println("입력된 두 숫자의 값이 같습니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("정수가 아닌 값이 입력되었습니다. 정수를 입력해주세요.");
        } finally {
            sc.close();
        }
    }
}
