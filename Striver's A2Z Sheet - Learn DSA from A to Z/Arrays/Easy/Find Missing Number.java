public import java.util.*;

class Main {
    static int missingNum(int[] arr) {
        int n = arr.length+1;
        int sum_expc = (n*(n+1))/2;
        int sum_act = 0;
        for(int i:arr){
            sum_act +=i;
        }
        return sum_expc - sum_act;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int res = missingNum(arr);
        System.out.println(res);
    }
} {
 
}
