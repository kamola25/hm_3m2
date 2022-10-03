public class BankAccount {
    public double amount;

    public int getAmount() {
        return (int) amount;
    }

    public void deposit(double sum) {
        if (amount == 0) {
            amount = sum;
        } else {
            System.out.println(amount + sum);
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Oshibka. Na vashem balance nedostatocho sredstv." +
                    "Vash tekushiy balance: ", getAmount());
        }
        System.out.println(amount = amount - sum);
    }
}
