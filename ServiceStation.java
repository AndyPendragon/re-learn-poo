import java.util.List;
import java.time.Instant;

public class ServiceStation {
  String id;
  String name;
  List<Product> products;
  Instant lastUpdate;
  String location;

  public void supply(Product product, Instant supplyDate, double suppliedQuantity) {
    product.setLastSupplyDate(supplyDate);
    product.setQuantity(product.getQuantity() + suppliedQuantity);
  }

  public void sellByQuantity(Product product, double quantity) {}

  public void sellByAmount(Product product, double amount) {}

  public void isValid(Product product, double requestedQuantity){
    return requestedQuantity <= product.getQuantity();
  }
}
