public public static void rotateArrayByOne(int[] nums, int k) {
        int n = nums.length;
        int i = 1;
        while (i<=k){
            int temp = nums[0];
            for (int j = 1; j < n; j++){
                nums[j-1] = nums[j];
            }
            nums[n-1] = temp;
            i++;
            //System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 34,3, 5};
        int k = 2;
        rotateArrayByOne(ar, k);
    } {
 
}
