class Solution {
    int isPlaindrome(String S) {
        // code here
        return checkPal(S);
        
    }
    public static int checkPal(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        String s1=new String(sb);
        int flag= s1.equals(s)? 1 : 0 ;
        return flag;
    }
};
