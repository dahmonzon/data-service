package ml.telliya.dataservice.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString
@Document(collection = "images")
public class Images {

    @Id
    private String id;
    private String key;
    private String url;
}
