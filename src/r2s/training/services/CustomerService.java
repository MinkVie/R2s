package r2s.training.services;

import r2s.training.entities.Customer;
import r2s.training.entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService{
    List<Customer> customersList = new ArrayList<>();


    public  void createCustomer(){

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            if(name.equals("n") || name.equals("N"))
                break;
            System.out.println("Enter phone: ");
            String phone = scanner.nextLine();
            if(phone.equals("n") || phone.equals("N"))
                break;
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            if(address.equals("n") || address.equals("N"))
                break;
            System.out.println("Enter order info: ");
            while (true) {

                List<Order> orderList = new ArrayList<>();
                //String number, String date, int quantity, double price
                System.out.println("-- Number: ");
                String number = scanner.nextLine();
                if (number.equals("n") || number.equals("N"))
                    break;
                System.out.println("-- date: ");
                String date = scanner.nextLine();
                if (date.equals("n") || date.equals("N"))
                    break;
                System.out.println("-- quantity: ");
                String pQuantity = scanner.nextLine();
                int quantity;
                if (pQuantity.equals("n") || pQuantity.equals("N"))
                    break;
                else {
                    quantity = Integer.parseInt(pQuantity);
                }
                System.out.println("-- price: ");
                String pPrice = scanner.nextLine();
                double price;
                if (pPrice.equals("n") || pPrice.equals("N"))
                    break;
                else {
                    price = Integer.parseInt(pPrice);
                }

                Order order = new Order(number, date, quantity, price);
                orderList.add(order);
            }

            Customer customer = new Customer(name, phone,address);
            customersList.add(customer);

        }



    }

    public List<Customer> findAll(){
        return customersList;
    }

    public void  display(List<Customer> customersList){
        for(Customer customer : customersList){
            System.out.println(customer.toString());
        }
    }

    public List<Order> search(String phoneIn) {
        List<Order> listOrderById = new ArrayList<>();
        //tìm customer trùng sdt
        for (Customer customer : customersList) {
            if (customer.getPhone().equals(phoneIn)) {
                //lấy list order của customer có sdt trùng
                listOrderById = customer.getOrderList();
                return listOrderById;
            }
        }
        return null;
    }


    public boolean remove(String phoneIn) {
        List<Order> listOrderById = new ArrayList<>();
        for (Customer customer : customersList) {
            if (customer.getPhone().equals(phoneIn)) {
                //lấy list order của customer có sdt trùng
                listOrderById = customer.getOrderList();
                customersList.remove(customer);
                customersList.removeAll(listOrderById);
                return true;
            }
        }
        return false;
    }


}
