import java.util.*;

public class smlleststring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        char temp = ch[0];
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] < temp) {
                temp = ch[i];
            }
        }
        System.out.println("the smallest character: ");
        System.out.println(temp);
    }
}