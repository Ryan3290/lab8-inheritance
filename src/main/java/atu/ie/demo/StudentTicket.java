package atu.ie.demo;

public class StudentTicket extends Ticket {
    private int studentID;

    public StudentTicket(String eventName, String holderName, double basePrice, int studentID) {
        super(eventName, holderName, basePrice);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() - 0.2 * super.calculatePrice();
    }
}
