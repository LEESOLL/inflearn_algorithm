package recursion;

public class Main1_5 { //재귀로 최대값 찾기
    int findMax(int[] data, int begin, int end) { //버전 1
        if(begin == end)
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin + 1, end));
    }

    int findMaxMiddle(int[] data, int begin, int end) {
        if(begin >= end)
            return data[begin];
        else {
            int middle = (begin + end) / 2;
            int max1 = findMaxMiddle(data, begin, middle);
            int max2 = findMaxMiddle(data, middle + 1, end);
            return Math.max(max1, max2);
        }
    }

    public static void main(String[] args) {
        Main1_5 m = new Main1_5();
        int[] data = {4, 6, 0, 6, 5};
        System.out.println(m.findMax(data, 0, 4));
        System.out.println(m.findMaxMiddle(data, 0, 4));
    }
}
