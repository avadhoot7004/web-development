// Custom Exceptions
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class InvalidPaymentException extends Exception {
    public InvalidPaymentException(String message) {
        super(message);
    }
}

class WarrantyExpiredException extends Exception {
    public WarrantyExpiredException(String message) {
        super(message);
    }
}

// Electronics Shop Class
class ElectronicsShop {
    private int stock = 10;

    // Check stock for an item
    public void purchaseItem(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Item is out of stock. Available stock is: " + stock);
        }
        stock -= quantity;
        System.out.println("Purchase successful! Remaining stock: " + stock);
    }

    // Process payment
    public void processPayment(String paymentMethod) throws InvalidPaymentException {
        if (!paymentMethod.equals("CreditCard") && !paymentMethod.equals("DebitCard")) {
            throw new InvalidPaymentException("Invalid payment method. Only CreditCard or DebitCard accepted.");
        }
        System.out.println("Payment successful using: " + paymentMethod);
    }

    // Claim warranty
    public void claimWarranty(String purchaseDate, String currentDate) throws WarrantyExpiredException {
        // Simple date comparison logic using string compareTo method
        if (purchaseDate.compareTo(currentDate) < 0) {
            throw new WarrantyExpiredException("Warranty expired! Claim not valid for the purchase date: " + purchaseDate);
        }
        System.out.println("Warranty claim successful.");
    }
}

// Main Class
public class shopTest {
    public static void main(String[] args) {
        ElectronicsShop shop = new ElectronicsShop();

        try {
            // Purchase an item
            shop.purchaseItem(12); // Will throw OutOfStockException
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Process payment
            shop.processPayment("Cash"); // Will throw InvalidPaymentException
        } catch (InvalidPaymentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Claim warranty
            shop.claimWarranty("2025-01-26", "2025-01-27"); // Will throw WarrantyExpiredException
        } catch (WarrantyExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
