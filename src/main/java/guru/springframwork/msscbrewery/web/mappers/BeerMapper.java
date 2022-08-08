package guru.springframwork.msscbrewery.web.mappers;

import guru.springframwork.msscbrewery.domain.Beer;
import guru.springframwork.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author Jan Oleksik (jan.oleksik@hycom.pl)
 */
@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}