import java.time.Instant;

public class Product{
  String Id;
  ProductName productName;
  double quantity;
  double unitPricePerLiter;
  Integer evaporationRate;
  Instant lastSupplyDate;
}

enum ProductName {PETROLEUM, GAS, DIESEL}
