import java.time.Instant;
import lombok.*;

@Getter
public class StockMovement {
  Instant dateMovement;
  Product product;
  MovementType movementType;
  double quantity;
}

enum MovementType {IN, OUT}