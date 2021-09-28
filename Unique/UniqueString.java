package Unique;

import java.util.ArrayList;
import java.util.List;

class UniqueString{

    public static boolean isUnique(String str) {

        List<Character> savedChar= new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
                if(savedChar.isEmpty()){
                    savedChar.add(ch);
                } else {
                    if(findExisting(savedChar,ch)){
                        return false;
                    } else {
                        savedChar.add(ch);
                    }
                }
            }
        }
           
        return true;
      }

      public static boolean findExisting(List<Character> arr , char a){
          int i = 0;
            while(i < arr.size()) {
                if(arr.get(i) == a) {
                    return true;
                } else {
                    i++;
                }
            }
            return false;
      }

      public static void main(String args[]){
        System.out.println(isUnique("this u"));
      }
}
