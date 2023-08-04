import java.util.ArrayList;
import java.util.List;

public class Dress {
    private List<Customer> customerList = new ArrayList<>();
    private String name;

    public void register(Customer cus) {
        customerList.add(cus);
    }

    public void notifyCustomer() {
        for(Customer cus : customerList) {
            cus.update();
        }
    }

    public void restock(String name) {
        this.name = name;
        notifyCustomer();
    }
}
