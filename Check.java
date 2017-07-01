import java.io.Serializable;
public class Check implements Serializable{
    // instance variables - replace the example below with your own
    public int checkNumber;
    public double amount;
    public String reason;
    public String payee;

    /**
     * Constructor for objects of class Check
     */
    public Check(int checkNumber, double amount, String reason, String payee)
    {
        // initialise instance variables
        this.checkNumber=checkNumber;
        this.amount=amount;
        this.reason=reason;
        this.payee=payee;
    }
    
    public void printCheck(){
      System.out.println("Callan McGary           " + checkNumber);
      System.out.println("Pay to the order of _" + payee + "_________ $" + amount);
      System.out.println("For _" + reason + "___________");
    }
    
    public void adjustamount(double payment){
        amount=payment;
    }
    
    public void adjustReason(String why){
        reason=why;
    }
    
    public void adjustCheckNumber(int number){
        checkNumber=number;
    }
    
    public void adjustPayee(String reciever){
        payee=reciever;
    }
    
    public double returnAmount(){
        return amount;
    }
    
    public String returnReason(){
        return reason;
    }
    
    public int returnCheckNumber(){
        return checkNumber;
    }
    
    public String returnPayee(){
        return payee;
    }
}