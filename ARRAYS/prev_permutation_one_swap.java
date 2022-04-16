package ARRAYS;

import java.util.Arrays;

public class prev_permutation_one_swap {
    public static void main(String[] args) {
        int[] nums={4,3,2,1,5,4,1,1,1,2,2,3,3,3,4,4,5,5,5,5};
        System.out.println(Arrays.toString(prevPermOpt1(nums)));
    }

    public static int[] prevPermOpt1(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]<=nums[i+1]){
            i--;
        }
        if(i==-1){
            return nums;
        }
        int j=nums.length-1;
        while(j>=0 && (nums[j]>=nums[i] || nums[j]==nums[j-1])){
            j--;
        }   
        nums[j]=(nums[j]+nums[i])-(nums[i]=nums[j]);
        return nums;
    }
}

