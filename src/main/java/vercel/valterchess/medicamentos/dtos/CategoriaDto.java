package vercel.valterchess.medicamentos.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CategoriaDto {
    @NotBlank
    private final String nome;
}
