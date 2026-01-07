package DSARevision;

import javax.swing.tree.TreeNode;

public class maxprodsubtree {
    private long totalSum = 0;
    private long maxprod = 0 ;
    private static final int mod= 1_000_000_007;
    private long getTotalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + getTotalSum(root.left) + getTotalSum(root.right);
    }
    private long dfs(TreeNode root){
        if(root==null) return 0 ;
        long leftSum  = dfs(root.left);
        long rightSum = dfs(root.right);
        long subTreeSum = root.val + leftSum + rightSum;
        long product = subTreeSum * (totalSum - subTreeSum);
        maxprod = Math.max(maxprod, product);

        return subTreeSum;
    }
    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root); 
        dfs(root);                    
        return (int)(maxprod % mod);
        
    }
}
    
}
