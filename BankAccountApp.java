public class BankAccountApp { 
    private static double m_balance; 

    public static double deposit(double balance, double amount) { 
        System.out.println("Deposited: $" + amount); 
        return balance + amount; 
    } 

    public static double withdraw(double balance, double amount) { 
        if(amount > balance) { 
            System.out.println("Tried to withdraw $" + amount + " but failed due to insufficient funds."); 
            return balance; 
        } else { 
            System.out.println("Withdrew: $" + amount); 
            return balance - amount; 
        } 
    } 

    public static double checkBalance(double balance) { 
        System.out.println("Current balance: $" + balance); 
        return balance; 
    } 

    public double setBalance(double balance) { 
        return m_balance = balance;
    } 

    public double getBalance() { 
        return m_balance; 
    } 

    public static void main(String[] args) { 
        BankAccountApp m = new BankAccountApp(); 
        double currentBalance = m.setBalance(0); 
        currentBalance = deposit(currentBalance, 100); 
        m.setBalance(currentBalance);
        currentBalance = withdraw(currentBalance, 50); 
        m.setBalance(currentBalance);
        checkBalance(m.getBalance());
    } 
}

