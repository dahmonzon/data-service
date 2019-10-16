package ml.telliya.dataservice.repository;

import ml.telliya.dataservice.modele.Images;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ImagesRepo extends ReactiveMongoRepository<Images, String> {
}
