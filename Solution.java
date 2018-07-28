public class Solution {
    public static void main(String[] args) {

    }
    public boolean isOneBitCharacter(int[] bits) {
        int i;
        for( i=0; i<bits.length-1; ){
            if(bits[i]==0)
                i++;
            else
                i+=2;

        }
        if(i==bits.length-2)
            return true;
        return false;
    }
}
