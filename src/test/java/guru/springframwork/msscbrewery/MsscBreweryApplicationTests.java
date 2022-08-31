package guru.springframwork.msscbrewery;

import guru.springframwork.msscbrewery.domain.Beer;
import guru.springframwork.msscbrewery.web.mappers.BeerMapper;
import guru.springframwork.msscbrewery.web.model.BeerDto;
import guru.springframwork.msscbrewery.web.model.BeerStyleEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;
import java.util.UUID;

@SpringBootTest
class MsscBreweryApplicationTests {

    @Test
    void contextLoads() {
        BeerDto a = BeerDto.builder().id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .beerName("a").beerStyle(BeerStyleEnum.GOSE).build();
        Beer actual = BeerMapper.INSTANCE.beerDtoToBeer(a);
        Assertions.assertNotNull(actual);
    }

}
