package atm.models.transactions;

import atm.interfaces.Transaction;

public class BalanceEnquiry implements Transaction {
    @Override
    public float getAmount() {
        return 0;
    }

    @Override
    public boolean makeTransaction() {
        return false;
    }
}
