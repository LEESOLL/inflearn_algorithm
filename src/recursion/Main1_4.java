package recursion;

public class Main1_4 { //재귀로 순차탐색 수현, 매개변수 명시화
    int sequentialSearch(int[] data, int begin, int end, int target) {
        if(begin > end)
            return -1;
        else if (data[begin] == target)
            return  begin;
        else
            return sequentialSearch(data, begin+1, end, target);
    }

    int sequentialSearch2(int[] data, int begin, int end, int target) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            if(data[middle] == target)
                return middle;
            int index = sequentialSearch2(data, begin, middle-1, target);
            if (index != -1) //index에 값이 존재한다면
                return index;
            else return sequentialSearch2(data, middle+1, end, target);
        }
    }

    public static void main(String[] args) {
        Main1_4 m = new Main1_4();
        int[] data = {1, 2, 3, 4, 5};
        System.out.println(m.sequentialSearch(data,0,4,3));
        System.out.println(m.sequentialSearch2(data,0,4,3));
    }


}
