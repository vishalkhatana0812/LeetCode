package ARRAYS;

public class maximum_swaps {
    public static void main(String[] args) {
        System.out.println(maximumSwap(7236));
    }
    public static int maximumSwap(int nums) {
        String str=Integer.toString(nums);
        char arr[]=str.toCharArray();
        int [] digMap=new int[10];
        for(int i=0;i<arr.length;i++){
            digMap[arr[i]-'0']=i;
        }
        for(int i=0;i<arr.length;i++){
            int dig=arr[i]- '0';
            for (int j = 9; j >dig; j--) {
                if(digMap[j]>i){
                    int idx=digMap[j];
                    char t=arr[i];
                    arr[i]=arr[idx];
                    arr[idx]=t;
                    String a =String.valueOf(arr);
                    int n=Integer.parseInt(a);
                    return n;
                }
            }
        }
        return nums;
    }
}
