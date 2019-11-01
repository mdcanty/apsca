public class BankClient{
 public static void main(String[] args){

  BankAccount b1 = new BankAccount();
  BankAccount b2 = new BankAccount(1, 100, "Jill");
  BankAccount b3 = new BankAccount(2, 500, "Jack");
  
  System.out.println("Printing B1..."+ b1);
  System.out.println("Printing B2..."+ b2);
  System.out.println("Printing B3..."+ b3);
  
  b3.deposit(100000.0);
  
  System.out.println("Printing B3..."+ b3);
  
  b3.withdraw(1000000.0);
  
  System.out.println("Printing B3..."+ b3);
  
  b3.withdraw(50000.0);
  
  System.out.println("Printing B3..."+ b3);
  
  b3.cashOut();
  
  System.out.println("Printing B3..."+ b3);
  
  
  System.out.println(b2.verifyAccount("otto", 500));
  System.out.println(b2.verifyAccount("Jill", 1));
  
  b1.transferFunds(b2);
  
 System.out.println("Printing B1..."+ b1);
 System.out.println("Printing B2..."+ b2);
  
 }





}