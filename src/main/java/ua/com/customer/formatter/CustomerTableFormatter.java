package ua.com.customer.formatter;

import ua.com.customer.model.Customer;

import java.util.List;

public class CustomerTableFormatter implements CostomerFormatter {
    public void print(List<Customer> list) {
        for (Customer c : list) {
            System.out.printf("%2d %20s %10s %-20s\n", c.getId(), c.getSurname(), c.getName(), c.getFatherName());
        }
    }
}
