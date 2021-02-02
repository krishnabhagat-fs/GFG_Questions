//first of import stack from library
import java.util.*;
class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<x.length();i++)// iterating over the element
        {
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[')
            stack.push(x.charAt(i));// if it's got an openning parenthesis push it to stack
            else if(x.charAt(i)==')' || x.charAt(i)=='}' || x.charAt(i)==']')//if it got an closing paranthesis the check it in stack
            {
                if(stack.isEmpty()){
                return (false);// throw false when string has and closing paranthesis and stack is empty 
                }
                if(x.charAt(i)==')')
                {
                    if(stack.peek()=='(')//checking that it contains the exact pair or not
                    {
                        stack.pop();//if yes then pop out the element
                    }
                    else
                    {
                        return(false);//not satisfied it throw false
                        
                    }
                }
                else if(x.charAt(i)=='}')//checking what kind of parenthesis it's expecting
                {
                    if(stack.peek()=='{')//checking that it contains the exact pair or not
                    {
                        stack.pop();//if yes then pop out the element
                    }
                    else
                    {
                        return(false);//not satisfied it throw false
                        
                    }
                }
                else if(x.charAt(i)==']')//checking what kind of parenthesis it's expecting
                {
                    if(stack.peek()=='[')//checking that it contains the exact pair or not
                    {
                       stack.pop();//if yes then pop out the element
                    }
                    else
                    {
                        return(false);//not satisfied it throw false
                        
                    }
                }
            }
        }
        if(!stack.isEmpty())//checking out througout the loop if any elements their in stack or not
        return(false);//if stack contains some items then it must be unbalanced
        else
        return(true);//if stack is empty then it's balanced
    }
}