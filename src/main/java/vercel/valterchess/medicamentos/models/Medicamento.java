package vercel.valterchess.medicamentos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String marca;
    private BigDecimal preco;
    //Fazer a busca no serviço de estoque futuramente
    private int quantidade;
    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;
}
