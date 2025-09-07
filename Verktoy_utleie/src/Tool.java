import java.math.BigDecimal;

public class Tool {

    private int inventoryId;
    private String name;
    private ToolCategory category;
    private BigDecimal dailyPrice;
    private boolean available;

    public Tool(int inventoryId, String name, ToolCategory category, BigDecimal dailyPrice, boolean available) {
        this.inventoryId = inventoryId;
        this.name = name;
        this.category = category;
        if(dailyPrice == null || dailyPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Prisen må være over 0");
        }
        this.dailyPrice = dailyPrice;
        this.available = available;
    }

    // Overloader
    public Tool(int inventoryId, String name, ToolCategory category, BigDecimal dailyPrice) {
        this.inventoryId = inventoryId;
        this.name = name;
        this.category = category;
        if(dailyPrice == null || dailyPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Prisen må være over 0");
        }
        this.dailyPrice = dailyPrice;
        this.available = true;
    }

    // Getters
    public int getInventoryId() { return inventoryId; }
    public String getName() { return name; }
    public ToolCategory getCategory() { return category; }
    public BigDecimal getDailyPrice() { return dailyPrice; }
    public boolean getAvailable() { return available; }

    // Setters
    private void setInventoryId(int inventoryId) { this.inventoryId = inventoryId; }
    private void setName(String name) { this.name = name; }
    private void setCategory(ToolCategory category) { this.category = category; }
    private void setDailyPrice(BigDecimal dailyPrice) {
        if(dailyPrice == null || dailyPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Prisen må være over 0");
        }
        this.dailyPrice = dailyPrice;
    }
    private void setAvailable(boolean available) { this.available = available; }


    @Override
    public String toString() {
        return "ID: " + inventoryId + "\n" +
                "Name: " + name + "\n" +
                "Price: " + dailyPrice + "\n" +
                "Available: " + available;
    }
}
