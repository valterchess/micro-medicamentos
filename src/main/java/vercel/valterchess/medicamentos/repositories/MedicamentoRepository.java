package vercel.valterchess.medicamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vercel.valterchess.medicamentos.models.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}
