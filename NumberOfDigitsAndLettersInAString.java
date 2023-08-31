import java.util.*;
public class NumberOfDigitsAndLettersInAString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int digitCount = 0, letterCount = 0;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z'))
                letterCount++;
            else if(c>=48 && c<=57)
                digitCount++;
        }
        System.out.println("The number of digits is:");
        System.out.println(digitCount);
        System.out.println("The number of letters is:");
        System.out.println(letterCount);
        sc.close();
    }
}

/*Write a Program to calculate the number of digits and letters in a string.

Problem Solution:
1. Take a string from the user and store it in a variable.
2. Initialize the two count variables to 0.
3. Use a for loop to traverse through the characters in the string and increment the first count variable each time a digit is encountered and increment the second count variable each time a character is encountered.
4. Print the total count of both the variables.
5. Exit.

Sample Input:
Hello123

Sample Output:
The number of digits is:
3
The number of characters is:
5
 */