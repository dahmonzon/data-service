package ml.telliya.dataservice.repository;

import ml.telliya.dataservice.modele.Country;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CountryRepo extends ReactiveMongoRepository<Country, String> {
}
