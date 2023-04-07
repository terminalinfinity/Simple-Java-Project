package OrderManagement;

public class Main {

        public static void main(String[] args) {
            OrderManagement.OrderManagementSystem orderManagementSystem = new OrderManagement.OrderManagementSystem();

            orderManagementSystem.addOrder("John", "Shoes", 2, 50.0);
            orderManagementSystem.addOrder("Jane", "T-Shirt", 3, 20.0);

            orderManagementSystem.displayAllOrders();

            orderManagementSystem.displayOrder(1);

            orderManagementSystem.deleteOrder(2);

            orderManagementSystem.displayAllOrders();
        }
    }