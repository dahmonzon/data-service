package ml.telliya.dataservice.repository;

import ml.telliya.dataservice.modele.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepo extends ReactiveMongoRepository<Category, String> {
}
