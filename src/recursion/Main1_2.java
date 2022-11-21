package recursion;

public class Main1_2 {
    public static void printInBinary(int n) { //정수를 입력받아 이진수로 출력
        if(n < 2)
            System.out.print(n);
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        printInBinary(0);
    }
}
