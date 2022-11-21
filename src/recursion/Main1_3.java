package recursion;

public class Main1_3 { //배열의 합 구하기

    public static int sum(int n, int[] data) { //n은 배열의 길이
        if(n <= 0)
            return 0;
        else {
            return sum(n-1, data) + data[n-1];
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println(sum(5, data));
    }
}
