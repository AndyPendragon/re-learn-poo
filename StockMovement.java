import java.time.Instant;

public class StockMovement {
  Instant dateMovement;
  Product product;
  MovementType movementType;
  double quantity;
}

enum MovementType {IN, OUT}
