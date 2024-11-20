import java.util.Scanner;

public class printinitial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ' && (i == 0 || ch[i - 1] == ' '))
                System.out.print(ch[i]);
        }
    }
}