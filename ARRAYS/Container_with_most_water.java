package ARRAYS;

public class Container_with_most_water {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int max_area=0;
        int p1=0;
        int p2=height.length-1;
        while(p1<p2){
            int length=Math.min(height[p1], height[p2]);
            int breadth = p2-p1;
            int curr_area= length*breadth;
            max_area=Math.max(curr_area, max_area);
            if(height[p1]<height[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }

        return max_area;
    }
}
