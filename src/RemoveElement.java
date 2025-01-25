public class RemoveElement {
    public int remEl(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

        //my leetcode submission: https://leetcode.com/submissions/detail/1520368616/
    }
}

