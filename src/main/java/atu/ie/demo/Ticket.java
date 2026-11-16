package atu.ie.demo;

public class Ticket {
    private String eventName;
    private String HolderName;
    private double basePrice;

    public Ticket(String eventName, String holderName, double basePrice) {
        this.eventName = eventName;
        HolderName = holderName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return HolderName;
    }


    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "eventName='" + eventName + '\'' +
                ", HolderName='" + HolderName + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
