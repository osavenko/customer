package ua.com.customer.sorter;


import ua.com.customer.model.Customer;

import java.util.Comparator;

public class CustomerSortByCardNumber implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        return o1.getCardNumber().compareTo(o2.getCardNumber());
    }
}
