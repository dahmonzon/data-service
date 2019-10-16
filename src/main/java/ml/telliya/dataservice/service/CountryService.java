package ml.telliya.dataservice.service;

import ml.telliya.dataservice.modele.Country;
import ml.telliya.dataservice.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepo;

    public Mono<Country> getById(String id){
        if( id != null && id != ""){
            return countryRepo.findById(id);
        }else throw new RuntimeException();
    }
}
