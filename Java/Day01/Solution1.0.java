import java.io.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Day01 - "Data Types" solution
 * @author Gabriella Mara
 * @version 1.0
 */

public class Solution1.0 {
	
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int i = 4, i2;
        double d = 4.0, d2;
        String s = "HackerRank ", s2, out;

        i2 = in.nextInt();
        d2 = in.nextDouble();
        out = in.nextLine();	
        s2 = in.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        in.close();
    }
}