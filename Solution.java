import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        double F = sc.nextDouble();
        double pM = M / (M + F);
        double pF = F / (M + F);
        double p3M = 0;
        for(int i = 0;i < (1<<6);i++){
            int boys = 0;
            double p = 1;
            for(int j = 0;j < 6;j++){
                boolean isBoy = (i & (1 << j)) != 0;
                p *= isBoy ? pM : pF;
                if(isBoy)
                    boys++;
            }
            if(boys >= 3)
                p3M += p;
        }
        System.out.println(Math.round(1000 * p3M) / 1000d);
    }
}
