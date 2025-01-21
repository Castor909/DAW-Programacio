class Solution {
    static int maxSum(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.value;
        return root.value + Math.max(
            root.left != null ? maxSum(root.left) : Integer.MIN_VALUE,
            root.right != null ? maxSum(root.right) : Integer.MIN_VALUE
        );
    }
}
