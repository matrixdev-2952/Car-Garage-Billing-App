import java.util.ArrayList;
import java.util.List;

public class Invoice {
   private Customer customer;
   private List<Service> serviceList;
   private double totalAmount;

    public Invoice(Customer customer, List<Service> serviceList, double totalAmount) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalAmount = 0;
    }
    public void addService(Service service)
    {
        serviceList.add(service);
        totalAmount += service.getPrice();
    }

    public void printInvoice()
    {
        System.out.println("----------------------Invoice-----------------------");
        System.out.println();
        System.out.println("Customer Name: "+customer.getName()+" | Phone: "+customer.getPhone()+" | Car: "+customer.getCar().getModel()+ " | Number: "+customer.getCar().getCarNumber());
        System.out.println("Services:");
        for(Service service:serviceList)
        {
            System.out.println("# "+service.getName()+": $"+service.getPrice());
        }
        System.out.println("Total Amount: "+totalAmount);
        System.out.println();
        System.out.println("---------------------Thank You----------------------");
    }
}
