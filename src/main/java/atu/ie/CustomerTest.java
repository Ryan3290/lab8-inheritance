package atu.ie;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("paul","123456","Gort",123456,true);
    System.out.println(firstCustomer);

    Customer secondCustomer = new Customer();
    secondCustomer.setName("Bob");
    secondCustomer.setPhoneNumber("1234567");
    secondCustomer.setCustomerNumber(123);
    secondCustomer.setMailingList(true);
    System.out.println("");
    System.out.println(secondCustomer);
    }
}
