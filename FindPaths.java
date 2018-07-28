public class FindPaths {
    public static int findPaths(int m,int n,int N,int i,int j){
        long [][][]dp = new long [N+1][m][n] ;
        for(int step=1; step<=N;  step++){
            for(int row=0; row<m; row++){
                for(int col=0; col<n; col++){
                    //dp[step][row][col] = (
                            long   v1     =     row==0 ? 1:dp[step-1][row-1][col]  ;
                            long    v2    =     row==m-1 ? 1 : dp[step-1][row+1][col] ;
                            long    v3    =    col==0 ?  1: dp[step-1][row][col-1] ;
                            long    v4    =    col== (n-1) ? 1 : dp[step-1][row][col+1] ;
                    System.out.println("v1: "+v1+" v2: "+v2+" v3: "+v3+" v4: "+v4) ;
                           dp[step][i][j]=  (v1+v2 +v3+v4)%1000000007 ;
                  //  System.out.println("step "+step+" row "+row+" col "+col);
                }
            }
        }
        return (int)dp[N][i][j] ;
        //return 0 ;
    }

    public static void main(String[] args) {
        System.out.println(findPaths(3,3,3,0,0));
    }
}
