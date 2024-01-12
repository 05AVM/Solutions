class Solution {
    public boolean halvesAreAlike(String s) {
        int m=s.length()/2;
        String str1=s.substring(0,m);
        String str2=s.substring(m);
        
        int count1=0;
        int count2=0;
        
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o'||ch=='O' || ch=='u'|| ch=='U')
                count1++;
        }
         for(int i=0;i<str2.length();i++)
        {
            char ch1=str2.charAt(i);
            if(ch1=='a' || ch1=='A' || ch1=='e' || ch1=='E' || ch1=='i' || ch1=='I' || ch1=='o'||ch1=='O' || ch1=='u'|| ch1=='U')
                count2++;
         }
        
        if(count1==count2)
            return true;
        else
            return false;
        
        
    }
}