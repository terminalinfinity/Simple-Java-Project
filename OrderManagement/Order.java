package OrderManagement;
public class Order {

        private int orderId;
        private String customerName;
        private String item;
        private int quantity;
        private double price;

         Order(int orderId, String customerName, String item, int quantity, double price) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.item = item;
            this.quantity = quantity;
            this.price = price;
        }

        public int getOrderId() {
            return orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getItem() {
            return item;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

        public double getTotalCost() {
            return quantity * price;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId=" + orderId +
                    ", customerName='" + customerName + '\'' +
                    ", item='" + item + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", totalCost=" + getTotalCost() +
                    '}';
        }
    }