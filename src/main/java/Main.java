package main.java;

public class Main {
    public static void main(String[] args) {
        // Création d'un CurrentAccount
        WithDrawable currentAccount = new CurrentAccount(500); // Polymorphisme avec l'interface
        System.out.println(currentAccount);

        try {
            // Cast pour accéder à deposit (non défini dans l'interface)
            if (currentAccount instanceof Account) {
                ((Account) currentAccount).deposit(200);
                System.out.println("Après dépôt de 200 : " + currentAccount);
            }

            // Utilisation de withdraw via l'interface
            currentAccount.withdraw(100);
            System.out.println("Après retrait de 100 : " + currentAccount);

            // Tentative de retrait dépassant le solde
            currentAccount.withdraw(700);
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        // Création d'un SavingAccount qui n'implémente pas WithDrawable
        Account savingAccount = new SavingAccount(1000);
        savingAccount.deposit(500);
        System.out.println("SavingAccount après dépôt de 500 : " + savingAccount);

        // Vérification si savingAccount peut être casté en WithDrawable
        if (savingAccount instanceof WithDrawable) {
            System.out.println("SavingAccount peut retirer.");
        } else {
            System.out.println("SavingAccount n'a pas de fonctionnalité de retrait.");
        }
    }
}
