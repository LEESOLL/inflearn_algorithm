package recursion;

public class Main1_6 { //재귀로 이진탐색 구현하기
    public static int binarySearch(Integer[] data, Integer target, int begin, int end) {
        if(begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(data[middle]);
            if(compResult == 0)
                return middle;
            else if (compResult < 0)
                return binarySearch(data, target, begin, middle -1);
            else return binarySearch(data, target, middle + 1, end);
        }
    }

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(data, 9, 0, 9));
    }
}
