
package bankingdemo;

/**
 * Banking class
 * @author Ashika Shallow
 */
public abstract class Banking {
    
    // Attributes
    private double balance;
    private int deposits;
    private int withdrawals;
    private double interestRate;
    private double serviceCharges;
    
    /**
     * Constructor to initialise the balance and interestRate fields.
     * @param bal An account balance
     * @param rate Annual interest rate
     */
    public Banking(double bal, double rate){
        balance = bal;
        interestRate = rate;
    }
    
    /**
     * deposit method
     * @param dep A deposit
     */
    public void deposit(double dep){
        balance += dep;     // Add deposit to balance
        deposits++;         // Increment deposits variable
    }
    
    /**
     * withdraw method
     * @param w A withdrawal
     */
    public void withdraw(double w){
        balance -= w;       // Substract withdrawal from balance
        withdrawals++;      // Increment withdrawals variable;
    }
    
    /**
     * getBalance method
     * @return The amount in the balance variable
     */
    public double getBalance(){
        return balance;
    }
    
    /**
     * calcInterest method calculates the monthly interest and adds it to
     * the balance
     */
    public void calcInterest(){
        double monthlyIR = interestRate / 12;   // Calculate monthly interest rate
        // Calculate monthly interest
        double monthlyInterest = balance * monthlyIR;
        balance += monthlyInterest; // Add monthly interest to balance
    }
    
    /**
     * monthlyProcess method
     */
    public void monthlyProcess(){
        balance -= serviceCharges;  // Substract serviceCharges from balance
        calcInterest();
        withdrawals = 0;
        deposits = 0;
        serviceCharges = 0;
    }
}
