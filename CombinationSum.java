import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int []candidates = new int[]{2,3,6,7} ;
        int target = 7 ;
        combinationSum(candidates,target) ;
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> lists = new ArrayList<>() ;
        int sum=0;
        ArrayList<Integer> list = new ArrayList<>() ;
        dfs(candidates,0,target,sum,lists,list);

        List<List<Integer>> res = new ArrayList<>() ;

        for(int i=0; i<lists.size(); i++){
            ArrayList<Integer> tl = new ArrayList<>() ;
            for(int j=0; j<lists.get(i).size(); j++){
                for(int k=0; k<lists.get(i).get(j); k++)
                    tl.add(candidates[j]) ;
            }
            res.add(new ArrayList<>(tl)) ;
        }

        System.out.println(res);
        return  lists ;
    }

    static void dfs(int[] candidates,int index,int target,int temp,List<List<Integer>>lists, ArrayList list){
        //for( int candiate : candidates){
        if(index == candidates.length) {
            //do something here
            if(temp==target)
                lists.add(new ArrayList<>(list)) ;

            return;
        }

            for(int i=0; i<target/candidates[index]+1; i++){
                temp += candidates[index]*i ;
                list.add(i) ;
//                for(int k=0; k<i; k++){
//                    list.add(candidates[index]) ;
//                }
                index++ ;
                dfs(candidates,index,target,temp,lists,list);
                list.remove(list.size()-1) ;
//                for(int k=0; k<i; k++){
//                    list.remove(list.size()-1) ;
//                }

                index-- ;
                temp -= candidates[index]*i ;

            }
        //}
    }

}
