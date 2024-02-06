package Feb_05_Assignmenbt;
import java.util.Scanner;
//.Problem statement
//You are given a string ‘str’ of size ‘N’. Your task is to remove consecutive duplicates from this string recursively.
//
//For example:
//
//If the input string is ‘str’ = ”aazbbby”, then your output will be “azby”.
//Note that we are just removing adjacent duplicates.
//
//Problem statement
//You are given a string ‘str’ of size ‘N’. Your task is to remove consecutive duplicates from this string recursively.
//
//For example:
//
//If the input string is ‘str’ = ”aazbbby”, then your output will be “azby”.
//Note that we are just removing adjacent duplicates.

public class Q5_Remove_Duplicate
{

    public static String removeDuplicate(String s  )
    {
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return removeDuplicate(s.substring(1));
        }else{
            return s.charAt(0) + removeDuplicate(s.substring(1));
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String s = sc.next();
        String g = "";
        int i =s.length();
        System.out.println( removeDuplicate(s ));

    }
    }


