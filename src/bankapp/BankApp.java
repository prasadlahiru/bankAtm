/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
class Customer{
    String name;
    int PIN;
    int withdraw;
    int deposit;
    Scanner s2;
    int answer;
    int ans2;
    int total = 10000;
    
    public Customer(Scanner s1){
        s2=s1;
    }
    public void setCustomer(){
        System.out.println("Please enter your name: ");
        name = s2.nextLine();
        
        System.out.println("Please enter your PIN: ");
        PIN =s2.nextInt();

    }
    
    public void passCheck(){
        if(PIN == 2134){
            System.out.println("Withdraw or Deposit Money (deposit type 1, withdraw type 2: ");
            answer = s2.nextInt();
            
            
        }else{
        
           System.out.println("Your PIN number is incorrect!");
           System.out.println("Do you wish to continue (1/2): ");
           ans2 = s2.nextInt();
           if(ans2==1){
               System.out.println("Re-enter your PIN: ");
               PIN = s2.nextInt();
               passCheck();
               
               
           }else{
               System.exit(0); 
           }
    }
    }
    
    public void withDraw(){
        if( answer == 1){
            System.out.println("Enter deposit amount: ");
            deposit = s2.nextInt();
            total = total + deposit;
            System.out.println("You have deposited: Rs. " +deposit);
            System.out.println( "Your Account Blance is: Rs." + total);
        }else if(answer == 2){
            System.out.println("Enter withdraw amount: ");
            withdraw = s2.nextInt();
            if (withdraw >total){
                System.out.println("Insufficient fund! Enter amount less than: Rs."+total);
                System.out.println("Re-enter: ");
                withdraw = s2.nextInt();
                total = total - withdraw;
                System.out.println("Your withdraw amount is: Rs."+withdraw);
                System.out.println("Your acount balance  is: Rs."+total);
                
            }else {
                total = total - withdraw;
                System.out.println("Your withdraw amount is: Rs."+withdraw);
                System.out.println("Your acount balance  is: Rs."+total);
            }
            try {
 
                // Making thread t osleep for 1 second
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (InterruptedException e) {
 
                // Display the exception along with line
                // number
                // using printStacktrace() method
                e.printStackTrace();
            }
        }
}

}
public class BankApp {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        
        Customer obj = new Customer(s1);
        obj.setCustomer();
        obj.passCheck();
        obj.withDraw();
    }

}


    
    

    

