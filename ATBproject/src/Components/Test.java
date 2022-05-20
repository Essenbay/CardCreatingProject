package Components;

import java.sql.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date(2003, 3,20);
        DebitAccount debitAccount = new DebitAccount((Long)null, 0, new Date(2003, 3, 20), 10);
        CreditAccount creditAccount = new CreditAccount((Long)null, 0, new Date(2003,3,20), 20, new Date(2004,3,20));
        SavingAccount savingAccount = new SavingAccount((Long)null, 0, new Date(2003,3,20), 20, new Date(2004,3,20));
        DebitAccount debitAccount2 = new DebitAccount((Long)null, 0, new Date(2003, 3, 20),
                "Essenbay", "Assel", "address", "8747", 10);
        CreditAccount creditAccount2 = new CreditAccount((Long)null, 0, new Date(2003,3,20),
                "Shyngysbaeva", "Tolganai", "address", "8702",20, new Date(2004,3,20));
        SavingAccount savingAccount2 = new SavingAccount((Long)null, 0, new Date(2003,3,20),
                "Rustembek", "Assima", "address", "8727",20, new Date(2004,3,20));

        System.out.println(debitAccount2.toString());
        System.out.println(creditAccount2.toString());
        System.out.println(savingAccount2.toString());


    }
}

