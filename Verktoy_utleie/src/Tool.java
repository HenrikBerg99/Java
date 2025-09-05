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
        this.dailyPrice = dailyPrice;
        this.available = available;
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
    private void setDailyPrice(BigDecimal dailyPrice) { this.dailyPrice = dailyPrice; }
    private void setAvailable(boolean available) { this.available = available; }


    @Override
    public String toString() {
        return "ID: " + inventoryId +
                "Name: " + name +
                "Price: " + dailyPrice +
                "Available: " + available;
    }
}
