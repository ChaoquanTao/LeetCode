public class IsPowerOfFour {
    public static boolean isPowerOfFour(int num){
        if(num==1) return true;
        if(num==0) return false;
        while(num !=1){
            if(num%4 !=0)
                return false;
            else{
                num /=4 ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
    }

}
