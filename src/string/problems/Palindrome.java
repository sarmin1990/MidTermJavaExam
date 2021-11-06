package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.

        */
        String s="sarmin";
        String rev=" ";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
      if (s.equals(rev)){
          System.out.println("Palindrome String");
      }
      else {
          System.out.println("not a Palindrome String");//not giving me the true ans
      }

    }

}