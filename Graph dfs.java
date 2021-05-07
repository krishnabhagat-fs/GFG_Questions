class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean arr[] = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        dfs(0,adj,arr,res);
        return res;
    }
    public static void dfs(int data, ArrayList<ArrayList<Integer>> adj,boolean[] arr
    ,ArrayList<Integer> res)
    {
        arr[data] = true;
        res.add(data);
        for(int i : adj.get(data))
        {
            if(arr[i]==false)
            dfs(i,adj,arr,res);
        }
    }
}