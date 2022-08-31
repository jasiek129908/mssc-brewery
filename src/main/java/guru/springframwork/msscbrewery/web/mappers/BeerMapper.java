package guru.springframwork.msscbrewery.web.mappers;

import guru.springframwork.msscbrewery.domain.Beer;
import guru.springframwork.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Jan Oleksik (jan.oleksik@hycom.pl)
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class );


    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}