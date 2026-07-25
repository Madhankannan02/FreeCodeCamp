public static void moveZeroes(int[] nums) {
        int temp = 0;
        int j = 0;
        for (int i = 1; i <nums.length; i++) {
            if (nums[j] == 0 && nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }