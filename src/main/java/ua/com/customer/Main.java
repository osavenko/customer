package ua.com.customer;

import ua.com.customer.filter.CustomerFilter;
import ua.com.customer.formatter.CostomerFormatter;
import ua.com.customer.formatter.CustomerTableFormatter;
import ua.com.customer.formatter.CustomerTableFormatterWithCardNumber;
import ua.com.customer.model.Customer;
import ua.com.customer.sorter.CustomerSortByCardNumber;
import ua.com.customer.sorter.CustomerSortById;
import ua.com.customer.sorter.CustomerSortBySurname;
import ua.com.customer.util.UtilitesCustomer;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> list = UtilitesCustomer.getList();
        CostomerFormatter formatter = new CustomerTableFormatter();
        formatter.print(list);

        Collections.sort(list, new CustomerSortBySurname());
        System.out.println("=========After CustomerSortBySurname==========");
        formatter.print(list);

        Collections.sort(list, new CustomerSortById());
        System.out.println("=========After CustomerSortById==========");
        formatter.print(list);

        Collections.sort(list, new CustomerSortByCardNumber());
        System.out.println("=========After CustomerSortByCardNumber==========");
        formatter = new CustomerTableFormatterWithCardNumber();
        formatter.print(list);

        System.out.println("=========After CustomerFilter==========");
        BigInteger start = new BigInteger("5420303020201052");
        BigInteger end = new BigInteger("5420303020201056");
        List<Customer> newList = CustomerFilter.getRange(list, start, end);
        formatter.print(newList);
    }
}
