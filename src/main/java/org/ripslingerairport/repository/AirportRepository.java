package org.ripslingerairport.repository;

import org.ripslingerairport.domain.Airport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by renanpetronilho on 29/10/16.
 */
@Repository
public interface AirportRepository extends MongoRepository<Airport, String> {

    Airport findByIataCode(String iataCode);
}
