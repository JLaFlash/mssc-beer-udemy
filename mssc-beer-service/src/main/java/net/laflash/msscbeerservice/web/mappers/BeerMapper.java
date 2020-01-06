package net.laflash.msscbeerservice.web.mappers;

import net.laflash.msscbeerservice.domain.Beer;
import net.laflash.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
