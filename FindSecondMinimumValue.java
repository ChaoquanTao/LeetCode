public class FindSecondMinimumValue {
    /*
        用递归呀，递归找到左子树中的次小值，和右子树中的次小值，
        然后比较这两个次小值即可。
        需要注意子树找不到次小值的情况，
     */

  public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int findSecondMinimumValue(TreeNode root) {
      int lSecondMin=-1,rSecondMin=-1 ;
      if(root.left != null){
          if(root.left.val > root.val){
              lSecondMin = root.left.val ;
          }
          else
              lSecondMin = findSecondMinimumValue(root.left) ;
      }
      if(root.right != null){
          if(root.right.val > root.val)
              rSecondMin = root.right.val ;
          else
              rSecondMin =findSecondMinimumValue(root.right) ;
      }
        if(lSecondMin==-1 && rSecondMin==-1)
            return -1;
        else if(lSecondMin==-1 && rSecondMin!=-1)
            return rSecondMin;
        else if(lSecondMin!=-1 && rSecondMin==-1)
            return lSecondMin;
        else
            return lSecondMin<rSecondMin?lSecondMin:rSecondMin ;
    }
}
