public class KeyBoard {
    //判断一个数是不是素数，如果不是，分解
    public static int minSteps(int n) {
        int sum=0;
        if(n==1)
            return 0 ;
        if(n==2)
            return 2;
        for(int i=2; i*i<=n;i++){
            while(n%i==0){
                sum+=i ;
                n/=i;
            }
        }
        if(n!=1)
            sum+=n;
       return sum ;
    }

    public static void main(String[] args) {
        System.out.println(minSteps(28));
    }
}
