public class Customer {

    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        if(email == null || !email.contains("@")) { // Input validering i konstruktøør
            throw new IllegalArgumentException("Ikke gyldig e-post, må inneholde @");
        }
        this.email = email;
    }

    // Getters
    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Setters
    private void setCustomerId(int customerId) { this.customerId = customerId; }
    private void setName(String name) { this.name = name; }
    private void setEmail(String email) {
        if(email == null || email.contains("@")) {
            throw new IllegalArgumentException("Ikke gyldig e-post, må inneholde @");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + customerId + "\n" +
                "Name: " + name + "\n" +
                "E-mail: " + email;
    }

}
