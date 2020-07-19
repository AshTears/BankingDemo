
package bankingdemo;

/**
 * SavingsAccount class
 * @author Ashika Shallow
 */
public class SavingsAccount extends Banking {
    // Fields
    boolean status = true;    
    
    /**
     * Constructor initialises the balance and rate variables
     * @param bal
     * @param rate 
     */
    public SavingsAccount(double bal, double rate){
        super(bal, rate);
    }
    
    /**
     * withdraw method
     * @param w An amount to withdraw
     */
    public void withdraw(double w){
        // Determine if account is active or inactive
        if(getBalance() < 25.00)
            status = false;
        
        // If account is active, make the withdrawal
        if(status) super.withdraw(w);
    }
    
    /**
     * deposit method
     * @param d An amount to deposit
     */
    public void deposit(double d){
        double newBalance = getBalance() + d;
        
        if(!status && newBalance > 25.00)
            status = true;
        
        super.deposit(d);
    }
    
    /**
     * monthlyProcess method
     */
    public void monthlyProcess(){
        double charge = 0;
        
        if(getWithdrawals() > 4)
            charge += getWithdrawals() - 4;
        
        super.setServiceCharges(charge);
        super.monthlyProcess();
        
        if(getBalance() < 25.00) status = false;
    }
}
