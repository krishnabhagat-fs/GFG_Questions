class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
       trave(root,list);
        return list;
    }
    
     public static void trave(Node root,ArrayList<Integer> list)
    {
        if(root!=null)
        {
        list.add(root.data);
        trave(root.left,list);
        
        trave(root.right,list);
        }
    }
}
