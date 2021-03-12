class Solution {
    String reverseWords(String S) {
        S.trim();
        // code here 
        String arr[]=S.split("\\.");//This is for spliting strings in arrays of strings
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
            if(i!=0)
            sb.append(".");
        }
        //System.out.println(sb);
        return (new String(sb));
    }
}
