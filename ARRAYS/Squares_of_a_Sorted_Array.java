package ARRAYS;

import java.lang.Thread.State;
import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

public class Squares_of_a_Sorted_Array{
    public static void main(String[] args) {
        int arr[]={-5,-3,-2,-1};
        int ans[]=squares(arr);
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
    public static int[] squares(int arr[]){
        int ans[]=new int[arr.length];
        int p1=0;
        int p2=arr.length-1;
        int p=arr.length-1;
        while(p1<=p2){
            int s1=arr[p1]*arr[p1];
            int s2= arr[p2]*arr[p2];
           if(s2>=s1){
               ans[p]=s2;
               p2--;
           }
           else{
               ans[p]=s1;
               p1++;
           }
           p--;
        }
        return ans;
    }
}