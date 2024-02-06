package Feb_05_Assignmenbt;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//3.Problem statement
//You are given a string ‘str’ of even length. Your task is to find out if we divide the ‘str’ from the middle, will both the substrings contain an equal number of vowels or not.
//
//For Example:
//You are given, ‘str’= ‘codingninjas’, when we split this string we get, ‘coding’ and ‘ninjas’ which both contain 2 vowels each. Hence the answer is ‘True’.
//
//Note :
//You do not need to print anything. It has already been taken care of. Just implement the given function.
//Sample Input 1:
//        2
//codingninjas
//        helloworld
//Sample Output 2:
//True
//        False
//Explanation:
//For the first test case, ‘str’= ‘codingninjas’, when we split this string we get, ‘coding’ and ‘ninjas’ which both contain 2 vowels each. Hence the answer is ‘True’.
//
//For the second test case, ‘str’= ‘helloworld’, when we split this string we get ‘hello and ‘world’, which contain 2 and 1 vowels respectively. Hence the answer is ‘False’.
//Sample Input 2:
//        2
//Aa
//        AbbaaA
//Sample Output 2:
//True
//        False
public class Q3_Count_NumOf_Vowel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
         int n = str.length()/2;
        System.out.println(n);
         String g = "";
         String s = "";
     g = str.substring(0 ,str.length()/2);
        System.out.println(g);
        s = str.substring(n ,str.length())+ " ";
        System.out.println(s);
        int gcount =0 ;

        for(int i=0 ;i<g.length();i++){
            char ch = g.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' )
            {
                gcount++;
            }
        }
        System.out.println(gcount);
        int scount=0;
        for(int j=n ;j<str.length();j++){
            char ch1 = str.charAt(j);
            if(ch1=='a'|| ch1=='e'|| ch1=='i'|| ch1=='o'|| ch1=='u' )
            {
                scount++;
            }
        }
        System.out.println(scount);
        if(scount==gcount)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
