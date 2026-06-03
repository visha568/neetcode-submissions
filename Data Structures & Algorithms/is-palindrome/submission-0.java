class Solution {
    public boolean isPalindrome(String s) {

        String lwrCaseStr = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for(Character ch : lwrCaseStr.toCharArray()){
          if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        int left = 0; int right = sb.length() - 1 ;
        while(left<right){
            if(sb.charAt(left)==sb.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
