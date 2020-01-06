package net.laflash.msscbeerservice.web.controllers;

import net.laflash.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().beerName("The beer name").build(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity saveNewBeer(@Validated @RequestBody BeerDto beerDto){
        //ToDo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById( @PathVariable("beerId") UUID beerId,
                                        @Validated @RequestBody BeerDto beerDto){
        //ToDo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
