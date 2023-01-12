package Backtracking;

import java.util.Locale;

public class Subset_String {
    public static void findSubsets(String str, String ans, int i ){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            System.out.print(ans+" ");
            return;
        }

        //yes choice
        findSubsets(str,ans+str.charAt(i),i+1);
        //No choice
        findSubsets(str,ans,i+1);

    }
    public static void main(String args []){
        String  str = "abc";
        findSubsets(str,"",0);


    }
}
