package by.teachmeslills.sportcenter.servis;

import by.teachmeslills.sportcenter.entity.Customer;
import by.teachmeslills.sportcenter.repository.CustomerInterface;

public class CustomerService {
    private final CustomerInterface repository;

    public CustomerService(CustomerInterface  repository) {

        this.repository = repository;
    }
    public void add(Customer customer) {

        repository.addCustomer(customer);
    }
}
