package ua.com.customer.sorter;


import ua.com.customer.model.Customer;

import java.util.Comparator;

public class CustomerSortById implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        return o1.getId() >= o2.getId() ? 1 : -1;
    }
}
