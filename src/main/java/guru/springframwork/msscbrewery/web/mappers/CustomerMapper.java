package guru.springframwork.msscbrewery.web.mappers;

import guru.springframwork.msscbrewery.domain.Customer;
import guru.springframwork.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author Jan Oleksik (jan.oleksik@hycom.pl)
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customer);

}
