import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tool drill1 = new Tool(101, "Makita Drill", ToolCategory.DRILL, new BigDecimal(0));
        Customer c1 = new Customer(1, "Henrik Berg", "henrikberg9@gmail.com");

        System.out.println(c1 + "\n\n");
        System.out.println(drill1);

    }
}
