import java.util.Scanner;

/*Day-2 
Assignment Questions: Part-1
1. Write a program that uses if statement to find the minimum of three numbers.
2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R
3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS
‌
5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
6. Define a method to convert the decimal number to a binary number?
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail*/

class minimum{
	public static void main(String[] args)
	{
		int n1 = 45;
		int n2 = 32;
		int n3 = 55;
		if(n1 < n2 & n1 < n3)
		{
			System.out.println( "minimum of three number" + n1);
		}
		else if(n2 < n3)
		{
			System.out.println("minimum of three number " + n2);
		}
		else{
			System.out.println("minimum of three number " + n3);
		}
	}
}  
/*2. Write a program to do the following patterns using for loop?
//a) Using for loop patterns
  /*1      1
    1     1
      1
   1    1
  1       1 */ 

class patterns1{
	public static void main(String[] args){
		int rows =5;
		for(int i=0;i<rows;i++){
			for(int j =0;j<rows;j++){
				if(i == j || i+j == rows - 1 ){
					System.out.print("1"+ " " );
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
*b) R R R R
  R     R
  R R R R
  R    R
  R     R */
class Rpatern{
	public static void main(String[] args){
		int rows = 5;
		int col = 4;
		for(int i=1;i <= rows;i++){
			for(int j=1;j <= col;j++){
				if(i == 1 || i == 3){
					System.out.print("R ");
		        }else if(j==1 || (i == 2 && j == col) || (i == 4 && j == 3)  || (i == 5 && j == 4)){
					System.out.print("R ");
				}else{
					System.out.print("  ");
	 			}
			}
			System.out.println();
		}
	}
 }



 /*3. Write a program to do the following patterns using while loop? a)  ;
    1
  2   3 
4   5   6
  7   8 
    9*/

class Diamond{
	public static void main(String[] args){
		int m=3;
		int num=1;
		int i=1;
		while(i <= m){
			int space=1;
			while(space <= m-i){
				System.out.print(" ");
	            space++;
			}
			int k=1;
			while(k<=i){
				System.out.print(num + " ");
				num++;
				k++;
			}
			System.out.println();
			i++;
		}
		i=m-1;
		while(i >= 1){
			int space=1;
			while(space <= m-i){
				System.out.print(" ");
	            space++;
			}
			int k=1;
			while(k<=i){
				System.out.print(num + " ");
				num++;
				k++;
			}
			System.out.println();
			i--;
		}
	}
}

/* b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w*/
	   
class Right{
	public static void main(String[] args){
		int row=3;
		int i=1;
		while(i <= row){
			int j=1;
			while(j <= i){
				System.out.print("W ");
				j++;
			}
			System.out.println();
			i++;
		}
		i=row-1;
		while(i >= 1){
			int j=1;
			while(j <= i){
				System.out.print("W ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}

/*4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
class pascal{
	public static void main(String[]  args)
	{
		int n =4;
		int i=0;
		
		do {
			int space =0;
			do{
				System.out.print(" "); // space 
				space++;
			}while(space< n -i);
			int j=0;
			int value=1;
			do{
				if(j == 0 || i == 0)
				{
					value =1;
				}
				else{
					value = value * (i - j + 1 )/j;
				}
				System.out.print(value+ " ");
				j++;
			}
			while(j <= i );
			System.out.println();
			i++;
		}
		while(i < n);
	}
 }


b) ZOHO
CORP
ORAT
IONS*/

class Corporations{
	public static void main(String [] args){
		String str  = "ZOHOCORPORATIONS";
		int n = 4;
		int i =0;
		int length = str.length();
		do{
			int j=0;
			do{
				if(i + j < length){
					System.out.print(str.charAt(i+j));
				}
				j++;
			}while(j < n );
			System.out.println();
			i += n;
		}while(i < length);
	}
}
//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
 
 class Evannumber{
	public static int sumEvanNumber(int n){
		 int sum = 0;
		 for(int i = 1 ; i <= n;i++){
		    if(i % 2 !=0){
			  continue;
	    	}
		    sum +=i;
		  }
		 return sum;
	    }
       public static void main(String[] args){
	 int limit = 10;
	 int evanSum = sumEvanNumber(limit);
	 System.out.println("Sum of evan number 1 to " + limit + "is ; " + evanSum);
}
    }
 
//6. Define a method to convert the decimal number to a binary number?
class DecimalToBinary {

    public static String convertDecimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static void main(String[] args) {
        int num1 = 44;
        String binary1 = convertDecimalToBinary(num1);
        System.out.println("The binary of " + num1 + " is: " + binary1); 

        int num2 = 22;
        String binary2 = convertDecimalToBinary(num2);
        System.out.println("The binary of " + num2 + " is: " + binary2); 
    }
}
/*7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail*/
class Grade {
    public static void main(String[] args) {
        int percentage = 75; 

        int gradeValue;
        if (percentage >= 85 && percentage <= 100) {
               gradeValue = 3;
        } else if (percentage >= 70) {
                 gradeValue = 2;
        } else if (percentage >= 50) {
                 gradeValue = 1;
        } else {
               gradeValue = 0;
        }

        switch (gradeValue) {
            case 3:
                   System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 1:
                  System.out.println("Grade C");
                break;
            default:
                System.out.println("False");
        }
    }     
}

/*Day-2
 Assignment Questions: Part-2 Arrays
1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
2. Write a program to take in 10 values and print only those numbers which are prime.
3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
10.Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n       
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m */

// 1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

class OddSum{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int oddSum = 0; 
           Scanner scan = new Scanner(System.in);
            System.out.println("Enter 10 integer values for the array:");
           for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt(); 
        }
          for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i]; 
            }
        }
        System.out.println("The sum of all odd numbers in the array is: " + oddSum);
    }
}

//2. Write a program to take in 10 values and print only those numbers which are prime.

 class PrimeNumber {
    public static boolean prime(int num) {
        if (num <= 1) { 
            return false;
        }
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) { 
                return false;
            }
        }
        return true; 
    }
public static void main(String[] args) {
        int number = 4;
        if (prime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class Fibonacci {

    public static void main(String[] args) {
        int n = 30; 
        long[] fibonacciSeries = new long[n]; 
        if (n > 0) {
            fibonacciSeries[0] = 0;
        }
        if (n > 1) {
            fibonacciSeries[1] = 1;
        }
     for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

       System.out.println("Fibonacci Series (first " + n + " terms):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
	
}
/*4.Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and
sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the
required result by invoking the function print( ).*/
 
 class SingleDouble{
	static void print(int[] x,int n){
		int singleSum=0, doubleSum=0;
		for(int i=0; i < n; i++){
			if(x[i] >= 0 && x[i] <= 9) singleSum+=x[i];
			else if(x[i] >= 10 && x[i] <= 99) doubleSum+=x[i];
		}
        System.out.println("The Sum of Single Digit Number is : " + singleSum);
	    System.out.println("The Sum of double Digit Number is : " + doubleSum);
	}
	public static void main(String[] args){
		int[] x={2,3,4,55,77,99,22,3,9};
		int n=9;
		print(x,n);
	}
 }
/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/

class Identical{
	public static void main(String[] args){
		char x[]={'m','n','o','p'};
        char y[]={'m','n','o','p'}; 
		boolean identical=true;
		if(x.length != y.length) identical=false;
		for(int i=0; i<y.length; i++){
			if(y[i] != x[i]){
				identical=false;
				break;
			}
		}
         if(identical){
			System.out.println("Yes,  Identical");
    }else{
			System.out.println("No, Not Identical");
		}
    }
}

/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/
		   
//import java.util.Scanner;
class GraduationYearSearch {

    public static void main(String[] args) {
        int[] graduationYears = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2022};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the year of graduation: ");
        int yearToSearch = scan.nextInt();

        int low = 0;
        int high = graduationYears.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (graduationYears[mid] == yearToSearch) {
                found = true;
                break;
            } else if (graduationYears[mid] < yearToSearch) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Record exists");
        } else {
            System.out.println("Record does not exist");
        }
    }
}
// 7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

class StoreWeight{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double arr[] = new double[10]; 
		System.out.println("enter weight of ten members");
		for(int i=0;i<10;i++){
			arr[i]=scan.nextDouble();
		}
		for(int i=0;i<arr.length-1;i++){
			int max =i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] > arr[max]){
					max=j;
				}
			}
			double temp = arr[i]; 
			arr[i] = arr[max];
			arr[max]=temp;
		}
		System.out.println("descending order :");
		for(int i=0;i<arr.length;i++){
			System.out.println("weight " + arr[i]); 
		}
	}
}
// 8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.

class People{
	public static void main(String[] args){
		int EightyToSixty = 0;
		int lessthaneighteen = 0;
		int greaterthansixty=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age of ten members");
		for(int i=0;i<10;i++){
		  int age =scan.nextInt();
		  if(age < 18){
			lessthaneighteen++;
		  } else if (age >= 18 && age <=60 ){
			EightyToSixty++;
		  } else {
			greaterthansixty++;
		  }
		}		 
	System.out.println("lesseightteen : " + lessthaneighteen);
	System.out.println("EightyToSixty : " + EightyToSixty);
	System.out.println("greaterthansixty : " + greaterthansixty);
}
}
//9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

class StudeSubject{
	public static  void main(String [] args){
		int []rollNo= {101,102,103,104,105,106,107,108,109,110};
		int []sub1={11,22,33,44,55,66,77,88,99,10};
		int []sub2={21,22,23,66,54,50,76,87,98,44};
        int []sub3={76,78,99,36,69,96,22,55,76,32};
		int totalmarks[]=new int[10];
		int average[]=new int[10];
		System.out.println("rollNo " + "\t" + "totalmarks" + "\t" + " average");
		for(int i = 0;i < 10;i++){
			totalmarks[i] = sub1[i]+sub2[i]+sub3[i];
		    average[i] = totalmarks[i]/3;
		    System.out.println(rollNo[i] + "\t" + totalmarks[i] + "\t" + average[i]);
	    }
	}
}
/*10.Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n       
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/
class Dimensional {
    public static void main(String[] args){
       int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int sum = 0;
    for(int i = 0 ; i < mat.length ; i++){
    for(int j = 0 ; j <mat[0].length;j++){
     System.out.print(mat[i][j]);
     sum+=mat[i][j];
       }
         System.out.println();
     } 
         System.out.println("\n\n Sum = " + sum+"\n\nRow-wise Sum\n\n");
       for(int i = 0 ; i < mat.length ; i++){
       int Rowsum = 0 ;
       for(int j = 0 ; j <mat[0].length;j++){
       Rowsum+=mat[i][j];
    }
      System.out.println("Row " + (i + 1)+ ":"+Rowsum);
   }
       System.out.print("\nCol-wise Sum\n");
     for(int i = 0 ; i < mat.length ; i++){
       int Colsum = 0 ;
      for(int j = 0 ; j <mat[0].length;j++){
       Colsum+=mat[j][i];
     }
        System.out.println("Col " + (i + 1)+ ":"+Colsum);
   }
        System.out.print("\nTranspose\n");
       for(int i = 0 ; i < mat.length ; i++)
         {
      for(int j = 0 ; j <mat[0].length;j++)
       {
       System.out.print(mat[j][i]);
       }
        System.out.println();
     } 
   }
}
	
/*Day-2 Assignment Questions: Part-3 Strings
1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
‌
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
‌
3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
‌
4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
‌
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
‌
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
‌
7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
‌
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
04:20 PM
Kindly thumbs up that you have seen the topics and assignemnt questions, you received and seen them.
04:23 PM
remaining thumbs up?
04:40 PM


1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

 class Binary{
	static String calcBinary(String a,String b){
		StringBuilder result=new StringBuilder();
		int aLength=a.length()-1;
		int bLength=b.length()-1;
		int carry=0;
		while(aLength >= 0 || bLength >= 0 || carry==1){
			if(aLength >= 0){
				carry += a.charAt(aLength--)- '0';
			}
			if(bLength >= 0){
				carry += b.charAt(bLength--)-'0';
			}
			result.append(carry % 2);
			carry /= 2;
		}
		return result.reverse().toString();
	}
	public static void main(String[] args){
		String a="1100";
		String b="1010";
		System.out.println(calcBinary(a,b));
	}
}


/*2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1*/
 
class Title{
	static String colVal(int colNum){
		String result="";
		//colNum=1;
		while(colNum > 0){
			colNum--;
			int remainVal=colNum % 26;
			char charVal =(char)('A' + remainVal);
			result=charVal + result;
			colNum/=26;
		}
	    return result;
	}
	public static void main(String[] args){
		int colNum=28;
		String title=colVal(colNum);
		System.out.println("The Column title is : "+ title);
	}
}
/*3.Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.*/

class Vowels{
	static String vowel(String c){
		char ch[]=c.toCharArray();
		int left=0;
		int right=c.length()-1;
		while(left < right){
			while(left < right && !isVowel(ch[left]))left++;
			while(left < right && !isVowel(ch[right]))right--;
			char temp=ch[left];
			ch[left] = ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	    return new String(ch);
	}
	static boolean isVowel(char s){
		if(s =='a' || s =='e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
			return true;
        }
		return false;
    }
    public static void main(String[] args){
		String c="IceCreAm";
		String result=vowel(c);
		System.out.println("The Reversed Vowel String is : " + result);
	}
}

/*4.You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters. */
 

 
class Shuffle{
	static Character difference(String s,String t){
		int sum=0;
		for(int i=0; i<t.length(); i++){
			sum +=t.charAt(i);
		}
		for(int i=0; i<s.length(); i++){
			sum  -= s.charAt(i);
		}
		return (char)sum;
	}
	public static void main(String[] args){
		String t="abcd";
		String s="abcde";
		//String result=difference(t1,s1);
		System.out.println(difference(t,s));
	}
}

/*5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?*/

class Sequence{
	static boolean isSubsequence(String s,String t){
		if(s.length()==0){
			return true;
		}
		if(s.length() > t.length()){
			return false;
		}
		char[] sArray=s.toCharArray();
		char[] tArray=t.toCharArray();
		int i=0,j=0;
		while(j < tArray.length){
			if(sArray[i] == tArray[j]){
				i++;
				if(i == sArray.length){
					return true;
				}
			}
			j++;    
		}
		return i == sArray.length;
	}
	public static void main(String[] args){
		String s1="abc";
		String t1="ahbgdc";
		System.out.println( isSubsequence(s1,t1) + " : The String is Subsequence ");
		String s2="wxyz";
		String t2="abcd";
		System.out.println(  isSubsequence(s2,t2) + " : The String is Not Subsequence ");
	}
}
 /*6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself. */
			

class Strdigits{
	static String addStr(String num1,String num2){
		StringBuilder result=new StringBuilder();
		int i=num1.length()-1;
		int j=num2.length()-1;
		int carry=0;
		while(i >= 0 || j >= 0 || carry > 0){
			if(i >= 0){
				carry += num1.charAt(i--)- '0';
			}
			if(j >= 0){
				carry += num2.charAt(j--)-'0';
			}
			result.append(carry % 10);
			carry /= 10;
		}
		return result.reverse().toString();
	}
	public static void main(String[] args){
		String num1="123";
		String num2="100";
		System.out.println(addStr(num1,num2));
	}
}
/* 7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/
		
class Segments{
	static int countSegments(String s){
		int segmentCount=0;
		if(s.length() < 0){
			return 0;
	    }
		for(int i=0; i<s.length(); i++){
			if((i == 0 || s.charAt(i-1) == ' ')&&s.charAt(i) != ' '){
				segmentCount++;
		    }
		}
		return segmentCount;
	}
    public static void main(String[] args){
		String s1="Welcome To ZOHO Corporation";
		System.out.println("The Number of Segments in a String is:" + countSegments(s1));
	}
}
		
/*8.We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.*/


class Capital{
	static boolean isCapital(String word){
		int capitalCount=0;
		int n=word.length();
		for(int i=0; i<n; i++){
			char ch=word.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				capitalCount++;
			}
		}
		if(capitalCount == 0 || capitalCount == n || capitalCount == 1 && Character.isUpperCase(word.charAt(0))){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String word1="USA";
		System.out.println(isCapital(word1));
		String word2="FlaG";
		System.out.println(isCapital(word2));
	}
}





