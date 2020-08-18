package ua.com.customer.filter;

import ua.com.customer.model.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CustomerFilter {
    public static List<Customer> getRange(List<Customer> list, BigInteger start, BigInteger end) {
        List<Customer> newList = new ArrayList<Customer>();
        for (Customer c : list) {
            if ((c.getCardNumber().compareTo(start) >= 0)
                    && (c.getCardNumber().compareTo(end) <= 0)) {
                newList.add(c);
            }
        }
        return newList;
    }
}
