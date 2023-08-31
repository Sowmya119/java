import java.util.*;
public class CelsiusToFahrenheit {
    public static float toFahrenheit(float celsius) {
            return (float)  32+(celsius*9)/5;
        }
    public static float toKelvin(float celsius) {
        return (float) (celsius+273.15);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        System.out.println(toFahrenheit(celsius));
        System.out.println(toKelvin(celsius));
        sc.close();
    }
}

/*Write a program to convert the temperature Celsius into Fahrenheit and kelvin.
Make two functions called fahrenheit and kelvin.They takes an argument of type float. They should return a float value. You must complete the code so that it passes all the test cases.

Your otuput should be of two lines.
First line - Fahrenheit temperatue
Second line - Kelvin temperature

Example
Input
10

Output
50
283.15

 */