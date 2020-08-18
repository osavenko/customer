package ua.com.customer.formatter;

import ua.com.customer.model.Customer;

import java.util.List;

public class CustomerTableFormatterWithCardNumber implements CostomerFormatter {
    public void print(List<Customer> list) {
        for (Customer c : list) {
            System.out.printf("%4d %18d %-20s %-20s %-20s\n", c.getId(), c.getCardNumber(), c.getSurname(), c.getName(), c.getFatherName());
        }
    }
}
