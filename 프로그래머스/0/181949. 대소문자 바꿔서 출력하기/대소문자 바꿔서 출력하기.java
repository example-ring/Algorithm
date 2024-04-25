import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
        str += Character.toLowerCase(c); 
    } else if (Character.isLowerCase(c)) {
        str += Character.toUpperCase(c); 
    } else {
        str += c;
    }
}
        System.out.println(str);
    }
}