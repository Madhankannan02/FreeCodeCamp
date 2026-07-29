import java.util.*;

class Main {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int  actual_count = 0;
        int max_count = 0;
        for (int i: nums) {
            if(i==1){
                actual_count++;
                max_count = Math.max(actual_count, max_count);
            } else {
                actual_count = 0;
            }
        }

        return max_count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);
    }
}