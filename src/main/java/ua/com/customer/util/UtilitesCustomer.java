package ua.com.customer.util;

import ua.com.customer.model.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class UtilitesCustomer {
    public static int getMaxId(List<Customer> list) {
        int max = 0;
        for (Customer customer : list) {
            if (customer.getId() > max) {
                max = customer.getId();
            }
        }
        return max;
    }

    public static List<Customer> getList() {
        List<Customer> list = new ArrayList<Customer>();
        int newId = UtilitesCustomer.getMaxId(list) + 1;
        list.add(new Customer(newId, "Савенко", "Олег", "Юрійович",
                "", new BigInteger("5420303020201056"), ""));
        newId = UtilitesCustomer.getMaxId(list) + 1;
        list.add(new Customer(newId, "Савенко", "Иван", "Олегович",
                "", new BigInteger("5420303020201057"), ""));
        newId = UtilitesCustomer.getMaxId(list) + 1;
        list.add(new Customer(newId, "Савенко", "Елена", "Олександрівна",
                "",new BigInteger("5420303020201050"), ""));
        newId = UtilitesCustomer.getMaxId(list) + 1;
        list.add(new Customer(newId, "Савенко", "Вадим", "Юрійович",
                "", new BigInteger("5420303020201051"), ""));
        newId = UtilitesCustomer.getMaxId(list) + 1;
        list.add(new Customer(newId, "Савенко", "Анна", "Олександрівна",
                "", new BigInteger("5420303020201052"), ""));
        newId = UtilitesCustomer.getMaxId(list) + 1;
        list.add(new Customer(newId, "Савенко", "Наталія", "Володимирівна",
                "", new BigInteger("5420303020201053"), ""));

        return list;
    }
}
