package FinalProject;

import java.util.*;

public class ConsoleProgram{

    private static Scanner scanner = new Scanner(System.in);

    public void run(){
        /* Overridden by subclass */
    }

    public static String readLine(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean readBoolean(String prompt){

        while(true){
            String input = readLine(prompt);

            if(input.equalsIgnoreCase("true")|| input.equalsIgnoreCase("y")){
                return true;
            }

            if(input.equalsIgnoreCase("false")|| input.equalsIgnoreCase("n")){
                return false;
            }
        }
    }

    public static double readDouble(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                double n = Double.valueOf(input).doubleValue();
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    // Allow the user to get an integer.
    public static int readInt(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    /**
     * Allows us to use a shorthand version for System.out.println()
     */
    public static void println() {
        System.out.println();
    }

    /**
     * Allows us to use a shorthand version for System.out.println(String s)
     */
    public static void println(String s) {
        System.out.println(s);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(boolean x)
     */
    public static void println(boolean x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(char x)
     */
    public static void println(char x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(char[] x)
     */
    public static void println(char[] x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(int x)
     */
    public static void println(int x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(long x)
     */
    public static void println(long x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(float x)
     */
    public static void println(float x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(double x)
     */
    public static void println(double x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(Object o)
     */
    public static void println(Object o) {
        System.out.println(o);
    }

    /**
     * Allows us to use a shorthand version for System.out.print()
     */
    public static void print() {
        System.out.print("");
    }

    /**
     * Allows us to use a shorthand version for System.out.print(String s)
     */
    public static void print(String s) {
        System.out.print(s);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(boolean x)
     */
    public static void print(boolean x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(char x)
     */
    public static void print(char x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(char[] x)
     */
    public static void print(char[] x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(int x)
     */
    public static void print(int x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(long x)
     */
    public static void print(long x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(float x)
     */
    public static void print(float x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(double x)
     */
    public static void print(double x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(Object o)
     */
    public static void print(Object o) {
        System.out.print(o);
    }
}