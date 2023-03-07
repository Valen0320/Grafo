package co.edu.umanizales.msgrafo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class City {
    private String code;
    private String name;
    private float latitude;
    private float longitude;

}
