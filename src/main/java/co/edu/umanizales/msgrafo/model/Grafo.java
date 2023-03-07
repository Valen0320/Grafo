package co.edu.umanizales.msgrafo.model;

import lombok.Data;

import java.util.List;

@Data

public class Grafo {
    private List<Vertice> vertices;
    private List<Arista> aristas;
    private boolean direction;

}
