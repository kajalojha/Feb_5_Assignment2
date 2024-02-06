package Feb_05_Assignmenbt;
import java.util.Scanner;
//Assume you are working at a newspaper. Your task is to prepare a page with titles that writers send you. Your cat
// was walking over your keyboard and accidentally added characters. Now you need to filter out the titles and prepare
// them for publishing.
//Assume that titles are in an array of strings. You need to do the following procedures on it:
//        • Create a single string by concatenating the strings in the array
//• Delete all numeric symbols from the string
//• Capitalize the first character of each word in the string
//Don't forget to think through any corner cases.
//Examples:
//Input: ["break3ing news5:", "1A 1circle is round!"]
//Output: "Breaking News: A Circle Is Round!"
//Input: ["", "Fresh fried fish fried"] - fish fresh
//Output: "Fresh Fried Fish Fish Fresh - Fried"
//Input: ["2Here2 ", "is", our STRING"]
//Output: "Here Is Our STRING"
//Input: ["123", "eat; sleep; repeat", "321"]
//Output: "Eat; Sleep; Repeat"
public class Q2_Filter_title
{

    public static String captialize(String str)
    {
        String s = "";
        String arr[] = str.split(" ");
        String g = "";

        int i , j ;
        for(i=0 ;i<arr.length;i++) {
            String s1 = arr[i];
            char ch = s1.charAt(0);
            if (ch > 97 && ch <= 122  ) {
                ch = (char) (ch - 32);
            }
//            s = s +ch+s1.substring(1, s1.length() )+ " ";

            s = s + ch + s1.substring(1, s1.length()) + " ";
        }
          for( j=0 ;j<s.length();j++)
          {
              char k = s.charAt(j);
              if( k>=48 && k<=57)
              {
                 continue;
              }
              else{
                  g= g+ k;
              }
          }

        return g ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str =  "hello3 how hy6";
        String ans = captialize(str);
        System.out.println(ans);
    }
}
