package atm.models.users;

import atm.interfaces.Account;
import atm.interfaces.User;

public class NonPremiumUser implements User {
    @Override
    public void getName() {

    }

    @Override
    public Account getAccount() {
        return null;
    }
}
