package ARRAYS;

public class Next_Greater_Element_III {
    
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(21));
    }
    public static int nextGreaterElement(int n) {
        String str=Integer.toString(n);
        int nums[]=new int[str.length()];
        for(int i=0;i<nums.length;i++){
            nums[i]=str.charAt(i)-'0';
        }
        if(!nextPermutation(nums)){
            return -1;
        }
        int res=0;
        
        for(int i=0;i<nums.length;i++){
            if(res > Integer.MAX_VALUE/10)return -1;
            if(res==Integer.MAX_VALUE/10 && nums[i] > 7)return -1;
            res=res*10+nums[i];
        }
        return res;
    }
    public static boolean nextPermutation(int[] nums){
        int j=nums.length-2;
        while(j>=0 && nums[j]>=nums[j+1]){
            j--;
        }
        if(j==-1){
            return false;
        }
        int i=nums.length-1;
        while(i>j && nums[i]<=nums[j]){
            i--;
        }
        swap(nums,i,j);
        reverse(nums, j+1,nums.length-1);
        return true;
    }
    public static void swap(int nums[], int i ,int j){
        nums[j]=(nums[j]+nums[i])-(nums[i]=nums[j]);
    }
    public static void reverse(int []nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
   
}
