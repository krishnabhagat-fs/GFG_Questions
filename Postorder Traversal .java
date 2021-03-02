class Tree
{
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> list=new ArrayList<>();
       trav(root,list);
       return list;
    }
    public static void trav(Node root, ArrayList<Integer> list)
    {
        if(root==null)
        return;
        trav(root.left,list);
        trav(root.right,list);
        list.add(root.data);
    }
}

