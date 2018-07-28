import static java.lang.Math.min;

public class Matrix2{
    public static void main(String[] args) {
        int[][] matrix =
                //{{0,0,0}, {0,1,0}, {1,1,1}} ;
//                {   {0, 0, 1, 0, 1, 1, 1, 0, 1, 1},
//                        {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
//                        {1, 1, 1, 1, 1, 0, 0, 0, 1, 1},
//                        {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
//                        {0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
//                        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
//                        {1, 1, 1, 1, 0, 1, 0, 1, 0, 1},
//                        {0, 1, 0, 0, 0, 1, 0, 0, 1, 1},
//                        {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
//                        {1, 0, 1, 1, 1, 0, 1, 1, 1, 0}};
                {       {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 0, 0, 1, 1, 0},
                        {1, 1, 1, 1, 1, 1, 0, 0, 1, 0},
                        {1, 0, 0, 1, 1, 1, 0, 1, 0, 1},
                        {0, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                        {1, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                        {1, 1, 0, 0, 1, 0, 1, 0, 1, 1}};

        int [][] matrix2 ;
        matrix2 = updateMatrix(matrix) ;
        System.out.println("last");
        for(int i=0 ; i<matrix2.length; i++){
            for(int j=0; j<matrix2[0].length;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int[][] updateMatrix(int[][] matrix){
        //
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    if(i>0 && matrix[i-1][j]==0) {
                        matrix[i][j]=1;
                        continue;
                    }
                    if(i<matrix.length-1 && matrix[i+1][j]==0){
                        matrix[i][j]=1 ;
                        continue;
                    }
                    if(j>0 && matrix[i][j-1]==0){
                        matrix[i][j]=1 ;
                        continue;
                    }
                    if(j<matrix[0].length-1 && matrix[i][j+1]==0){
                        matrix[i][j]=1;
                        continue;
                    }
                    matrix[i][j]=65535 ;
                }
            }
        }
        System.out.println("first ");
        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.printf("%-8d",matrix[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==65535){
                    if(i>0){
                        matrix[i][j] = min(matrix[i-1][j]+1,matrix[i][j]);
                    }
                    if(j>0){
                        matrix[i][j] = min(matrix[i][j-1]+1,matrix[i][j]);
                    }
                }
            }
        }

        System.out.println("second ");
        for(int i=0 ; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.printf(matrix[i][j]+"\t");
            }
            System.out.println();
        }


        for(int i=matrix.length-1; i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(i<matrix.length-1)
                    matrix[i][j]=min(matrix[i+1][j]+1,matrix[i][j]);
                if(j<matrix[0].length-1)
                    matrix[i][j]=min(matrix[i][j+1]+1,matrix[i][j]);
            }
        }


        return matrix;

    }
}