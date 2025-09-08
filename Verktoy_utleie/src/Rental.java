import java.time.LocalDate;

public class Rental {

    private int rentalId;
    private int customerId;
    private int inventoryId;
    private LocalDate startDate;
    private LocalDate endDate;

    public Rental(int rentalId, int customerId, int inventoryId, LocalDate startDate, LocalDate endDate) {
        this.rentalId = rentalId;
        this.customerId = customerId;
        this.inventoryId = inventoryId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters
    public int getRentalId() { return rentalId; }
    public int getCustomerId() { return customerId; }
    public int getInventoryId() { return inventoryId; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }

    // Setters
    private void setRentalId(int rentalId) { this.rentalId = rentalId; }
    private void setCustomerId(int customerId) { this.customerId = customerId; }
    private void setInventoryId(int inventoryId) { this.inventoryId = inventoryId; }
    private void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    private void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "Rental ID: " + rentalId + "\n" +
                "Customer ID: " + customerId + "\n" +
                "Inventory ID: " + inventoryId + "\n" +
                "Start date: " + startDate + "\n" +
                "End date: " + endDate;
    }

}
