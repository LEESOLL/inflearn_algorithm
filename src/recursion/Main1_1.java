package recursion;

public class Main1_1 {

    public static int length(String str) { //recursion으로 문자열 길이 구하기
        if(str == "")
            return 0;
        else
            return 1 + length(str.substring(1));
    }

    public static void printChars(String str) { //recursion으로 문자열 출력하기
        if(str == "")
            return;
        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    public static void printCharsReverse(String str) { //문자열 뒤집어서 출력하기
        if(str == "")
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    public static void main(String[] args) {
        String str = "LEESOLL";
        System.out.println(length(str));
        printChars(str);
        System.out.println();
        printCharsReverse(str);
    }
}
