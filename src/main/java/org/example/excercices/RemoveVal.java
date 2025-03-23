package org.example.excercices;

public class RemoveVal {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)return 0;
        int N = nums.length;
        int i=0, j=N-1;
        while (true)
        {
            while(nums[i]!=val)
            {
               i++;
               if(i>N-1) break;
            }
            while (nums[j]==val)
            {
                j--;
                if(j<0) break;
            }
            if(i>=j) break;
            exch(i,j,nums);
        }

        return i;


    }
    private void exch(int i , int j , int[] a){
        int t = a[i];
        a[i] = a[j]; a[j] =t;
    }
}
