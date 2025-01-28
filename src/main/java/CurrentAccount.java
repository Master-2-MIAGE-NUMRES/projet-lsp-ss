package main.java;

public class CurrentAccount extends Account implements WithDrawable {

    public CurrentAccount(float montant){
        super(montant);
    }


    @Override
    public void withdraw(float montant) throws IllegalArgumentException {
        if (montant > depositAmount) {
            throw new IllegalArgumentException("Le montant du retrait dépasse le solde disponible.");
        }
        depositAmount -= montant;
    }

    @Override
    public String toString() {
        return "CurrentAccount balance: " + depositAmount;
    }

}
