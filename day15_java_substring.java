import java.io.*;
import java.util.*;
import java.util.Scanner;

public class day15_java_substring {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s  = scan.next();
        int start = scan.nextInt();
        int end   = scan.nextInt();
        scan.close();
        
        System.out.println(s.substring(start, end));
    }
}