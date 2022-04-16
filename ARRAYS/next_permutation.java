package ARRAYS;
import java.util.*;
public class next_permutation {
    public static void main(String[] args) {
        int nums[]={5,1,2,3,5,4,4,3,3,2,2,1,1,1};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        int j=nums.length-1;
        int point=0;
        for(;j>0;j--){
            if(nums[j]>nums[j-1]){
                point=j-1;
                break;
            }
        }
        if(point==-1){
            int l=point+1;
            int m=nums.length-1;
            while(l<=m){
                int t=nums[m];
                nums[m]=nums[l];
                nums[l]=t;
                l++;
                m--;
            }
            return;
        }
        for(int k=nums.length-1;k>point;k--){
            if(nums[k]>nums[point]){
                int t=nums[k];
                nums[k]=nums[point];
                nums[point]=t;
                break;
            }
        }
        //.out.println(Arrays.toString(nums));
        int l=point+1;
        int m=nums.length-1;
        while(l<=m){
            int t=nums[m];
            nums[m]=nums[l];
            nums[l]=t;
            l++;
            m--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
