package vercel.valterchess.medicamentos.dtos;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MedicamentoDto implements Serializable {
    @NotBlank
    private final String nome;
    @NotBlank
    private final String marca;
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer=5, fraction=2)
    private final BigDecimal preco;
    @NotNull
    private final int quantidade;
    @NotNull
    private long categoriaId;
}
