class Tree
{
    // Return a list containing the inorder traversal of the given tree
    //static ArrayList<Integer> list=new ArrayList<>();
    public static ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Tree.trave(root,list);
        return list;
    }
    public static void trave(Node root,ArrayList<Integer> list)
    {
        if(root==null)
        return;
        trave(root.left,list);
        list.add(root.data);
        trave(root.right,list);
    }
    
}