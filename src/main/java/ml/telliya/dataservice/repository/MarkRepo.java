package ml.telliya.dataservice.repository;

import ml.telliya.dataservice.modele.Mark;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MarkRepo extends ReactiveMongoRepository<Mark, String> {
}
