class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int current = 2;
        if(nums.length <= 2) return nums.length;

        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[current - 2]){
                nums[current] = nums[i];
                current++;
            }
        }
        return current;
    }
}
