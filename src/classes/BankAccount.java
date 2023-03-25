package classes;
import java.lang.*;

public class BankAccount {
    private String name;
    private String phno;
    private float balanceAmount;

    public String getName(){
        return name;
    }
    public String getPhno(){
        return phno;
    }
    public float getBalanceAmount() {
        return balanceAmount;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhno(String phno){
        this.phno = phno;
    }
    public void setBalanceAmount(float amount){
        this.balanceAmount = amount;
    }
    public BankAccount(){
    }
    public BankAccount(String name, String phno, float balanceAmount){
        setName(name);
        setPhno(phno);
        setBalanceAmount(balanceAmount);
    }
}
