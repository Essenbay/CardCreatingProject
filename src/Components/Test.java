package Components;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Date date = new Date(2003, 3,20);
        DebitAccount debitAccount = new DebitAccount((Long)null, 0, new Date(2003, 3, 20), 10);
        CreditAccount creditAccount = new CreditAccount((Long)null, 0, new Date(2003,3,20), 20, new Date(2004,3,20));
        SavingAccount savingAccount = new SavingAccount((Long)null, 0, new Date(2003,3,20), 20, new Date(2004,3,20));
        DebitAccount debitAccount2 = new DebitAccount((Long)1L, 0, new Date(2003, 3, 20),
                "Essenbay", "Assel", "address", "8747", 10);
        CreditAccount creditAccount2 = new CreditAccount((Long)3L, 0, new Date(2003,3,20),
                "Shyngysbaeva", "Tolganai", "address", "8702",20, new Date(2004,3,20));
        SavingAccount savingAccount2 = new SavingAccount((Long) 2L, 0, new Date(2003,3,20),
                "Rustembek", "Assima", "address", "8727",20, new Date(2004,3,20));

        List<Account> accounts = new ArrayList<>();
        accounts.add(debitAccount2);
        accounts.add(creditAccount2);
        accounts.add(savingAccount2);
        System.out.println(accounts);
        Collections.sort(accounts);
        System.out.println(accounts);

    }
}

