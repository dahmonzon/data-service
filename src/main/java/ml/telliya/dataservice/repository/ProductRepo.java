package ml.telliya.dataservice.repository;

import ml.telliya.dataservice.modele.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ReactiveMongoRepository<Product, String> {
}
