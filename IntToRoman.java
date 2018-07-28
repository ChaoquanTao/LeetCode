import static java.lang.Math.pow;

public class IntToRoman {
    public static String intToRoman(int num){
        int arr[] = new int[4];
        int t=0;
        StringBuffer res = new StringBuffer() ;
        for(int i=1000; i>=1; i/=10){
            arr[t++] = (num / i) ;
            num %=i ;
        }
        System.out.println(res);
//        for(int i=0;i<arr.length;i++)
//            System.out.println(arr[i]);
        for(int i=0; i<arr.length;i++){
            while(arr[i]!=0) {
                if (arr[i] == 9){
                    switch (i){
                        case 0:

                            break;
                        case 1:
                            res.append("CM");
                            break;
                        case 2:
                            res.append("XC");
                            break;
                        case 3:
                            res.append("IX");
                            break;
                    }
                    arr[i]-=9 ;
                }else if(arr[i]==4){
                    switch (i){
                        case 0:

                            break;
                        case 1:
                            res.append("CD");
                            break;
                        case 2:
                            res.append("XL");
                            break;
                        case 3:
                            res.append("IV");
                            break;
                    }
                    arr[i]-=4 ;
                } else if(arr[i]==5){
                    switch (i){
                        case 0:

                            break;
                        case 1:
                            res.append("D");
                            break;
                        case 2:
                            res.append("L");
                            break;
                        case 3:
                            res.append("V");
                            break;
                    }
                    arr[i]-=5 ;
                }else {
                    if (arr[i] > 5) {
                        switch (i){
                            case 0:
                                break;
                            case 1:
                                res.append('D');
                                arr[i] -=5 ;
                                break;
                            case 2:
                                res.append('L');
                                arr[i] -=5 ;
                                break;
                            case 3:
                                res.append('V');
                                arr[i] -=5 ;
                                break;
                        }
                    } else {
                        for(int k=0; k<arr[i];k++){
                            switch (i){
                                case 0:
                                    res.append('M');
                                    break;
                                case 1:
                                    res.append('C');
                                    break;
                                case 2:
                                    res.append('X');
                                    break;
                                case 3:
                                    res.append('I') ;
                                    break;
                            }
                        }
                        arr[i]=0;
                    }
                }
            }
        }


        return  res.toString();
    }

    public static void main(String[] args) {
        String sb =intToRoman(1994) ;
        System.out.println(sb);
    }

}
