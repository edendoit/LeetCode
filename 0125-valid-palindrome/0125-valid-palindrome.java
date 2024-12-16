class Solution {
    public boolean isPalindrome(String s) {
        boolean isSame = true;
        List<Character> list = new ArrayList<>();
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || Character.isDigit(s.charAt(i))) {
                list.add(s.charAt(i));
            }
        }
        for(int i=0; i<list.size(); i++) {
            int j = list.size()-i-1;
            if(list.get(i)==list.get(j)) {
                continue;
            } else {
                isSame = false;
                break;
            }
        }

        return isSame;

        }
    }