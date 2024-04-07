package normalPractice;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intger;
        String string;
        System.out.print("what is your Intger number?");
        intger = scan.nextInt();
        System.out.print("what is your Intger number?");
        intger = scan.nextInt();
        scan.nextLine();//첫 번쩨 문자열 받을 때 무조건 사용
        System.out.print("what is your String?");
        string = scan.nextLine();

        System.out.print("what is your String?");
        string = scan.nextLine();
        System.out.println("" + intger + string);
    }
}