import java.time.Instant;

public class Product{
  String id;
  ProductName productName;
  double quantity;
  double unitPricePerLiter;
  Integer evaporationRate;
  Instant lastSupplyDate;
}

enum ProductName {PETROLEUM, GAS, DIESEL}
