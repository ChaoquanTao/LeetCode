import java.util.ArrayList;

public class Pattern132 {
    public static boolean find132pattern(int[] nums) {
        int x,y,z ;
        int min,max ;
        if(nums.length==0)
            return false;
        min=max=nums[0] ;
        for(int i=1; i<nums.length;i++){
            min = nums[i]<min ? nums[i] : min ;
            max = nums[i]>max ? nums[i]:max ;
        }
        if(max-min<2)
            return false ;

        for(int i=0; i<nums.length;){
            x= nums[i];
            for(int j=i+1; j<nums.length;){
                y=nums[j];
                //如果遇见比x还小的值，就更新x,同时更新下标
                if(y<=x){
                    x=y;
                    i=j;
                    j++;
                    continue ;
                }

                for(int k=j+1; k<nums.length;k++){
                    z=nums[k];
                    //如果遇见比y还大的值，就更新y,同时更新下标
                    if(z>=y){
                        y=z ;
                        j=k;
                        continue;
                    }
                    if( x>=z){
                        continue;
                    }
                    else
                        return true ;
                }
                j++;
            }
            i++;
        }
        return false ;
    }

    public static void main(String[] args) {
        int []nums={1,0,0,-1,1};
        System.out.println(find132pattern(nums));
        int [][]n = {{1,2,3},
                     {4,5,6}};
        System.out.println();
    }
}
