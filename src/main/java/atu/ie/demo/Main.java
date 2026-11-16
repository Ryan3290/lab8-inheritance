package atu.ie.demo;

public class Main {
    public static void main(String[] args) {
        Ticket firstticket = new Ticket("Summer Concert", "Alice", 50);
        StudentTicket secondticket = new StudentTicket("Summer Concert", "Bob", 50, 1234);
        VIPTicket thirdticket = new VIPTicket("summer Concert", "Charlie", 50);

        System.out.println("Event" + firstticket.getEventName());
        System.out.println("Standard Ticket - " + firstticket.getHolderName() + " - " + firstticket.calculatePrice());
        System.out.println("student Ticket - " + secondticket.getHolderName() + " - " + secondticket.calculatePrice());
        System.out.println("VIP Ticket - " + thirdticket.getHolderName() + " - " + thirdticket.calculatePrice());
        System.out.println("Student ID - " + secondticket.getStudentID());
        System.out.println("VIP Ticket - " + thirdticket.getBenefits());
    }
}
