package atu.ie.demo;

public class VIPTicket extends Ticket{
    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + 25;
    }
    public String getBenefits(){
         String benefits = "Priority entery and reserved seating";
         return benefits;
    }
}
