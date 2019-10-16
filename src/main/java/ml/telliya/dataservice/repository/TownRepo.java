package ml.telliya.dataservice.repository;

import ml.telliya.dataservice.modele.Town;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TownRepo extends ReactiveMongoRepository<Town, String> {
}
