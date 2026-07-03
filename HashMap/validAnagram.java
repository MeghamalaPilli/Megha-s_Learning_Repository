import java.util.HashMap;

public class Solution
{
    public boolean isAnagram(String s,String t)
    {
        if (s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>charCount=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!charCount.containsKey(ch))
            {
                return false;
            }
            charCount.put(ch, charCount.get(ch)-1);
        }
        for(int count:charCount.values())
        {
            if (count!=0)
            {
                return false;
            }
        }
        return true;
    }
}
