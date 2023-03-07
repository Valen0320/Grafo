package co.edu.umanizales.msgrafo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Arista {
    private int weight;
    private String origin;
    private String destiny;

}
