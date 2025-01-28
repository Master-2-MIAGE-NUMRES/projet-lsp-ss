package main.java;

public abstract class Account {
    float depositAmount = 0;

    void deposit(float montant) {
        depositAmount+=montant;
    }
    public Account(float montant){
        depositAmount=montant;
    }
}
