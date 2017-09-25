package Lab1;
import java.util.*;
import java.io.*;
import java.lang.*;

public class task1 {
	public static void main(String[] args){
		String s1 = "abbba";
		String s2 = "dad";
		String s3 = "Dad";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		char[] c3 = s3.toCharArray();

		
		boolean check1 = isPalindrome(c1);
		boolean check2 = isPalindrome(c2);
		boolean check3 = isPalindrome(c3);
		
		System.out.println(s1 + ", is it a palindrome?: " + check1);
		System.out.println(s2 + ", is it a palindrome?: " + check2);
		System.out.println(s3 + ", is it a palindrome?: " + check3);

		
		
	}
	
	public static boolean isPalindrome(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
}
