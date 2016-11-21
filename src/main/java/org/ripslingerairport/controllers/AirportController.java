package org.ripslingerairport.controllers;

import org.ripslingerairport.domain.Airport;
import org.ripslingerairport.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Objects;

/**
 * Created by renanpetronilho on 10/11/16.
 */
@Controller
@RequestMapping("/airports")
@CacheConfig(cacheNames = "cache_airport")
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;

    @Cacheable
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Airport>> getAiports(Pageable pageable) {
        List<Airport> airports = airportRepository.findAll(pageable).getContent();
        return new ResponseEntity<>(airports, HttpStatus.OK);
    }

    @Cacheable(key = "#id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Airport> getAiport(@PathVariable String id) {
        Airport airport = airportRepository.findOne(id);
        if(Objects.nonNull(airport)) {
            return new ResponseEntity<>(airport, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
