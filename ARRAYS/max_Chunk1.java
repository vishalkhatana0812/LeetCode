package ARRAYS;

public class max_Chunk1 {
    public static void main(String[] args) {
        int []arr={1,0,2,4,3};
        System.out.println(maxChunksToSorted(arr));
    }

    public static int maxChunksToSorted(int[] arr) {
        int ans=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(arr[i], max);
            if(i==max){
                ans++;
            }
        }
        return ans;
    }
}
