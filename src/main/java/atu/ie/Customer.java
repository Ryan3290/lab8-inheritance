package atu.ie;

public class Customer extends person
{
    private int  customerNumber;
    public Customer(int customerNumber);
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    public Customer(String name, String phoneNumber, String address, int customerNumber, boolean mailingList) {
        super(name, phoneNumber, address);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
