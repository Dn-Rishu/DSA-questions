import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String str = sc.nextLine();
        String s = str.trim();
        System.out.println(s);
    }
}