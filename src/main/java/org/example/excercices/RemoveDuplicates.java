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

        int i = 0, j = 1;
        int max = nums[i];
        while (j < nums.length) {
            if(nums[i]==nums[j])
            {
                i++;
            }else if(nums[j]>max)
            {
                max=nums[j];
                exchange(i,j,nums);
                i++;
            }
            j++;
        }

        return i;
    }

    private void exchange(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}














