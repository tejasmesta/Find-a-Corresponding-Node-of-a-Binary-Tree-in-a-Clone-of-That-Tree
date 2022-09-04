class Solution {
    TreeNode ans, target;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) 
    {
        this.target = target;
        inorder(original, cloned);
        return ans;
    }
    
    public void inorder(TreeNode o, TreeNode c)
    {
        if(o==null)
        {
            return;
        }
        inorder(o.left, c.left);
        if (o == target) 
        {
            ans = c;    
        }
        inorder(o.right, c.right);            
    }
    
    
}
