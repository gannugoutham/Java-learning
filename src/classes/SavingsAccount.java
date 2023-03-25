package classes;

public class SavingsAccount extends BankAccount {
    private float amountDeposited;
    private float amountWithdrawn;

//Constructors - First parent constructor (BankAccount) is called then child constructor is called.

    public SavingsAccount(String name, String phno, float balance,  float amountWithdrawn) {
        super(name, phno, balance); //first 3 params are passed to the parent constructor.
        //if there is no super method. the child constructor only executes non-parameterized parent constructor and then child param/non-param constructor.
        setAmountWithdrawn(amountWithdrawn); // last param is used by the child constructor.
    }

    public float getAmountDeposited() {
        return amountDeposited;
    }
    public float getAmountWithdrawn() {
        return amountWithdrawn;
    }
    public void setAmountDeposited(float amountDeposited){
        this.amountDeposited = amountDeposited;
    }
    public void setAmountWithdrawn(float amountWithdrawn){
        this.amountWithdrawn = amountWithdrawn;
        float remainingBalance = getBalanceAmount()-amountWithdrawn;
        this.setBalanceAmount(remainingBalance);
    }

}
