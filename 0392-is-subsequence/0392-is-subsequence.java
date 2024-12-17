class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;

        int j=0;
        for(int i=0; i<s.length(); i++) {
            for(;j<t.length();j++) {
                if(s.charAt(i)==t.charAt(j)) {
                    j++;
                    if(i==s.length()-1) return true;
                    break;
                }
            }
        }
        return false;
    }
}