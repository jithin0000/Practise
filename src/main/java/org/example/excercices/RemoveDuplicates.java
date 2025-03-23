package org.example.excercices;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
//         [0,1,2,1,1,0,2,3,3,4]
//                i,    j
//        max=a[j]
//        0, 1,2
//      i = 0, j =0 or 0+1,
//        if both are same increment both
//        if j val > i val max=a[i] exchange(i,j)
//        j++
//        while j < N

        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            // We skip to next index if we see a duplicate element
            if (nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    private void exchange(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}














