package atm.models.accounts;

import atm.interfaces.Account;
import atm.interfaces.User;

public class SavingsAccount implements Account {
    @Override
    public User getHolder() {
        return null;
    }

    @Override
    public float getBalance() {
        return 0;
    }
}
