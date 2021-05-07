public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean arr[] = new boolean[V+1];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        q.add(0);
        arr[0] = true;
        while(!q.isEmpty())
        {
            int temp = q.remove();
            result.add(temp);
            for(int val : adj.get(temp))
            {
                if(arr[val] == false)
                {
                    q.add(val);
                    arr[val] = true;
                }
            }
        }
        return result;
    }