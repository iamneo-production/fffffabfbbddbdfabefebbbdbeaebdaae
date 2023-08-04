
public class AccountDetails {
    private String accountType;
    private double withdrawOrDepositAmount;
    private double availableBalance;
    private int pin;

    // Constructor
    public AccountDetails(String accountType, double withdrawOrDepositAmount, double availableBalance, int pin) {
        this.accountType = accountType;
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
        this.availableBalance = availableBalance;
        this.pin = pin;
    }

    // Getter and Setter for accountType
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Getter and Setter for withdrawOrDepositAmount
    public double getWithdrawOrDepositAmount() {
        return withdrawOrDepositAmount;
    }

    public void setWithdrawOrDepositAmount(double withdrawOrDepositAmount) {
        this.withdrawOrDepositAmount = withdrawOrDepositAmount;
    }

    // Getter and Setter for availableBalance
    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    // Getter and Setter for pin
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}


