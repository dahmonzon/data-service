package ml.telliya.dataservice.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Document(collection = "country")
public class Country {

    @Id
    private String id;
    private String name;
    private String phoneCode;
}
