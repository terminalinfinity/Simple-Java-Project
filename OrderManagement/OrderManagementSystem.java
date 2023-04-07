package OrderManagement;

import java.util.ArrayList;

public class OrderManagementSystem {

        private ArrayList<Order> orders = new ArrayList<>();
        private int nextOrderId = 1;

        public void addOrder(String customerName, String item, int quantity, double price) {
            Order order = new Order(nextOrderId++, customerName, item, quantity, price);
            orders.add(order);
            System.out.println("Order added: " + order);
        }

        public void displayAllOrders() {
            System.out.println("All Orders:");
            for (Order order : orders) {
                System.out.println(order);
            }
        }

        public void displayOrder(int orderId) {
            for (Order order : orders) {
                if (order.getOrderId() == orderId) {
                    System.out.println("Order found: " + order);
                    return;
                }
            }
            System.out.println("Order not found for orderId: " + orderId);
        }

        public void deleteOrder(int orderId) {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderId() == orderId) {
                    orders.remove(i);
                    System.out.println("Order deleted for orderId: " + orderId);
                    return;
                }
            }
            System.out.println("Order not found for orderId: " + orderId);
        }
    }