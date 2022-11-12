/*
Yazan Hajsaid
Jiang Li
CSC 222
Programming Assignment 10
 */

//import java utility and IO
import java.util.*;
import java.io.*;
public class ProgrammingAssignment10 {

	public static void main(String[] args) throws FileNotFoundException {
		
	//input
	System.out.println("How many numbers do you want read?");	
	Scanner keyboard = new Scanner(System.in);
	int userInput = keyboard.nextInt();
	
	//part 1 load the dictionary file and open it
	
	File data = new File("C:/Users/Mikey/Downloads/data.txt");
	Scanner readData = new Scanner(data);
	
	//part 2 read lines to user and print total
	
	//create array to store data
	int[] savedData = new int[15];
	int total=0;
	//for loop structure
	for(int i=0;i<userInput;i++) 
	{		
		savedData[i] = readData.nextInt();	
		System.out.println(savedData[i]);
		total = total + savedData[i];
	}
	//calculate total
	System.out.println("The total is " + total);
	
	}

}
/* output
How many numbers do you want read?
6
5
12
46
7
59
98
The total is 227
*/


