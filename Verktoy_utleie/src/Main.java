import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Henrik Berg", "henrikberg9@gmail.com");

        Tool drill1 = new Tool(101, "Makita Drill", ToolCategory.DRILL, new BigDecimal(100));
        Tool drill2 = new Tool(102, "Bosch Drill", ToolCategory.DRILL, new BigDecimal(250));
        Tool saw1 = new Tool(103, "Stihl Saw", ToolCategory.SAW, new BigDecimal(50));

        List<Tool> tools = new ArrayList<>();
        tools.add(drill1);
        tools.add(drill2);
        tools.add(saw1);

        Collections.sort(tools, new ToolComparator());

        for(Tool t : tools) {
            System.out.println(t);
            System.out.println("-----");
        }

    }
}
