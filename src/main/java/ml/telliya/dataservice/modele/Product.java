package ml.telliya.dataservice.modele;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Product {

    @Id
    private String id;
    private String title;
    private String barCode;
    private String place;
    private String code;
    private Category category;
    private Mark mark;
    private ProductFeature productFeature;
    private double cost;
    private double price;
    private double promoReduction;
    private double stock;
    private double limiteStock;
    private double weight;
    private boolean isAvalaible;
    private boolean inPromo;
}
