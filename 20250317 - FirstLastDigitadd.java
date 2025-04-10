https://www.geeksforgeeks.org/problems/corner-digits1317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Logic 1: gfg solution
class Solution {
    public int corner_digitSum(int n) {
         String s=String.valueOf(n);
        return s.length()==1?Integer.parseInt(s):Integer.parseInt(s.charAt(0)+"")+Integer.parseInt(s.charAt(s.length()-1)+"");
    }
}


Logic 2: Using String Conversion

  public class FirstLast {
    public static void main(String[] args) {
        
        int num = 12345;
        //Using String Conversion
        String s = Integer.toString(num);
        int first = s.charAt(0)-'0';
        int last = s.charAt(s.length()-1)-'0';

        System.out.println(first+last);
    }
    
}

/* debug
first = 49-48=1
here 0 ascill value is 48
last = str.charAt(5-1)-'0'
      = '5'-'0'
      = 53-48
      = 5
*/


Logic 3: using mathematical
    public class FirstLast {
    public static void main(String[] args) {
        
        int num = 12345;
        //Using Mathematical

        int last = num%10;
        int first = num;
        while(first >= 10){
            first /= 10;
        }

        System.out.println(first+last);
    }
    
}


