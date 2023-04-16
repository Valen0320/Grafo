package co.edu.umanizales.msgrafo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cities")
@AllArgsConstructor
@Data

public class City {
    @Id
    private String code;
    private String name;
    private float latitude;
    private float longitude;

}
