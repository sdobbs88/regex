
/**
 * Class: CSCI3510 Theory of Computation
 * Instructor: Dr. Hong Zhang
 * Description: Prints all substrings of a certain length for a given regular expression
 * Due: 02/27/2018
 *
 * @author Shaun C. Dobbs
 * @version 1.0
 *
 * I pledge by honor that I have completed the programming assignment
 * independently. I have not copied the code from a student or any source. I
 * have not given my code to any student. * Sign here: Shaun C. Dobbs
 */
import java.util.regex.*;
import java.util.Scanner;

public class Project6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Matcher m;
        Pattern p;
        String str, regex;

        System.out.print("Regular expression: ");

        regex = s.nextLine();

        System.out.print("n: ");

        int n = s.nextInt();

        p = Pattern.compile(regex);

        System.out.println("------- Strings in the language -------");

        System.out.println('\u03B5');

        for (int i = 0; i < (int) Math.pow(2, n); i++) {

            m = p.matcher(Integer.toBinaryString(i));

            if (m.matches() && Integer.toBinaryString(i).length() <= n) {
                System.out.println(Integer.toBinaryString(i));
            }

            str = Integer.toBinaryString(i);

            for (int j = 0; j < n; j++) {
                str = "0" + str;
                m = p.matcher(str);

                if (m.matches() && str.length() <= n) {
                    System.out.println(str);
                }
            }
        }
    }
}
