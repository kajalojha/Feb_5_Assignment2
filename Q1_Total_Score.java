package Feb_05_Assignmenbt;
import java.util.Scanner;
//    .Given an array of integers, keep a total score based on the following:
//        1. Add 1 point for every even number in the array
//2. Add 3 points for every odd number in the array, except for the number 5
//        3. Add 5 points for every time you encounter a 5 in the array
//If an empty or null array is passed to the function, return 0.
//Examples:
//Input: [1,2,3,4,5]
//Output: 13
//Input: [17,19,21]
//Output: 9
//Input: [5,5,5]
//Output: 15
public class Q1_Total_Score
{
    public static int totalScore(int arr[])
    {
        int count = 0;
        for(int i=0 ;i< arr.length ;i++)
        {
            if(arr[i]%2==0)
            {
              count =  count+1;
            } else if (arr[i]%2!=0 && arr[i] != 5)
            {
                count = count + 3;
            } else if (arr[i]==5 )
            {
                count =  count + 5;
            }
            if(arr[i]<0)
            {
                return 0;
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n ;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = totalScore(arr);

        System.out.println(ans);

    }
}
