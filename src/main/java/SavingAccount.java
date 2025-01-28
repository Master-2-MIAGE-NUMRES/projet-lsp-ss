package main.java;

public class SavingAccount extends Account{

    public SavingAccount(float montant){
        super(montant);
    }
    @Override
    public String toString() {
        return "SavingAccount balance: " + depositAmount;
    }
}
