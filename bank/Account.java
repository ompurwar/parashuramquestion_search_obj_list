
package bank;

public class Account {
    private int number;
    private String acType;
    private double balance;
    private int noOfAccountHolders;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNoOfAccountHolders() {
        return noOfAccountHolders;
    }

    public void setNoOfAccountHolders(int noOfAccountHolders) {
        this.noOfAccountHolders = noOfAccountHolders;
    }

    public Account(int number, String acType, double balance, int noOfAccountHolders) {
        super();
        this.number = number;
        this.acType = acType;
        this.balance = balance;
        this.noOfAccountHolders = noOfAccountHolders;
    }

}