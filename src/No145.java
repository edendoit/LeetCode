public class No145 {
//    public List<Integer> postorderTraversal(TreeNode root) {
//    LinkedList<Integer> ans = new LinkedList();
//    Stack<TreeNode> stack = new Stack();
//    if(root == null) return ans;
//
//    stack.push(root);
//    while(!stack.isEmpty()) {
//        TreeNode cur = stack.pop();
//        ans.addFirst(cur.val);
//        if(cur.left != null) stack.push(cur.left);
//        if(cur.right != null) stack.push(cur.right);
//    }
//    return ans;
//}
}
// https://leetcode.com/problems/binary-tree-postorder-traversal/discuss/45556/Java-simple-and-clean