package guru.springframwork.msscbrewery.services;

import guru.springframwork.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateBeer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}