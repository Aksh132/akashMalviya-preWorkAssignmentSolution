package myFirstProgram;

import java.util.Scanner;

public class Assignment1 {

    Scanner sc = new Scanner(System.in);

    //function to check palidrome Number

    public void checkPalindrome() {

        String myNumber, reverse = "";      // Objects of String class  
        Scanner in = new Scanner(System.in);   

        System.out.println("Enter a string/number to check if it is a palindrome");

        myNumber = in.nextLine();   
        int length = myNumber.length(); 

        for ( int i = length - 1; i >= 0; i-- )  {
           reverse = reverse + myNumber.charAt(i);

        }
        if (myNumber.equals(reverse)){  
           System.out.println("Entered string/number is a palindrome.");  
        }else{  
           System.out.println("Entered string/number isn't a palindrome.");   
     }  
    }


    // function to printPattern

    public void printPattern() {
        System.out.println("Please Enter your Number");
        int rows = sc.nextInt();

        for (int i = rows-1; i >=0; i--) 
        {
         for(int j=0; j<=i; j++)   
         {
             System.out.print("*" + "");
        }
        System.out.println();
        
    }
    }
    // function to check no is prime or not

    public void checkPrimeNumber() {
        System.out.println("Please Enter Number");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n +" "+ "is a prime number");
            }else{
                System.out.println(n + " "+"is not a prime number");
            }
    }
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
            
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
                
            }
        }
        return true;
        
    }
    
    //function to print Fibonacci series

    public void printFibonacciSeries() {
        System.out.println("Please Enter Your Number");
        int count = sc.nextInt();

        int n1 =0, n2 =1, n3,i;
        System.out.print(n1+" "+n2);

        for(i=2; i<count;++i)
        {
            n3 = n1+n2;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2=n3;
        }
    }


    // main method

    //initialize the first and second value as 0,1 respectively.

    int first = 0, second = 1;


// main method 

public static void main(String[] args) {
    Assignment1 obj = new Assignment1();

    int choice;
    Scanner sc = new Scanner(System.in);

    do {
        System.out.println("\n\nEnter Your Choice from below List.\n"+"1.Find Palindrome of number.\n"
        +"2. Print Pattern for a given no.\n"+"3. Check whether  the no is a prime number.\n"
        + "4. Print Fibonacci Series.\n"+"--> Enter 0 to Exit.\n");
        
        System.out.println();

        choice = sc.nextInt();
        switch (choice) {
            case 0:
            choice = 0;
                break;

                case 1:{
                    obj.checkPalindrome();
                }
                break;

                case 2:{
                    obj.printPattern();
                }
                break;

                case 3:{
                    obj.checkPrimeNumber();

                }
                break;
                
                case 4:{
                    obj.printFibonacciSeries();
                }
                break;


            default:

            System.out.println("Invalid choice. Enter a valid no.\n");
                break;
        }
    
    }while (choice!=0);
    System.out.println("Exited Successfully!!!");
    sc.close();

    }

}


