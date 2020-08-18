package ua.com.customer.sorter;

import ua.com.customer.model.Customer;

import java.util.Comparator;

public class CustomerSortBySurname implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        if (o1.getSurname().compareTo(o2.getSurname()) == 0) {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                if (o1.getFatherName().compareTo(o2.getFatherName()) == 0) {
                    return -1;
                } else {
                    return o1.getFatherName().compareTo(o2.getFatherName());
                }
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        } else {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }
}
