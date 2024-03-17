class Solution {
    public List<List<String>> partition(String s) {
       List < List < String >> res = new ArrayList < > ();
        List < String > path = new ArrayList < > ();
        Helper(0, s, path, res);
        return res;
    }
    
    public List<List<String>>Helper(int ind,String s,List<String> path,List<List<String>>res){
        //base case:--
        
        if(ind==s.length()){
            res.add(new ArrayList<>(path));
            return res;
        }
        
        for(int i=ind;i<s.length();i++){
            if(isPalin(s,ind,i)){
                path.add(s.substring(ind,i+1));
                Helper(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
        return res;
    }
        
        public boolean isPalin(String s,int start,int end){
            while(start<=end){
                if(s.charAt(start)!=s.charAt(end))
                    return false;
                start++;
                end--;
                
            }
            return true;
        }
    
    
}