public class ContainerWIthMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int start=0;
        int end=height.length-1;
        int max=0;
        while (start<end){
            int width=end-start;
            int area=Math.min(height[start],height[end])*width;
            max=Math.max(max, area);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        System.out.println(max);
    }
}
