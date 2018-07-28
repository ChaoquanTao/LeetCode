public class HIndex {
    public static int hIndex(int[] citations){
        quickSort(citations,0,citations.length-1) ;

        int h=1 ;
        for (int i=0; i<citations.length;i++){
            if(i+1 <= citations[i])
                h=i+1;
        }

        return h;
    }

    public static void quickSort(int[] ctt,int left,int right){
        int i=left;
        int j = right ;
        if(left > right)
            return;
        int pivot = ctt[left] ;
        while(j != i) {
            while (ctt[j] <= pivot && j > i) {
                j--;
            }
            while (ctt[i] >= pivot && j > i)
                i++;
            int t = ctt[i];
            ctt[i] = ctt[j];
            ctt[j] = t;
        }
        ctt[left] = ctt[i] ;
        ctt[i] = pivot ;

        quickSort(ctt,left,i-1);
        quickSort(ctt,i+1,right);
    }

    public static void main(String[] args) {
        int ctt[] = new int[5] ;
        ctt[0] =3;
        ctt[1]=0;
        ctt[2]=6 ;
        ctt[3]=1;
        ctt[4]=5;

        hIndex(ctt);

    }
}
