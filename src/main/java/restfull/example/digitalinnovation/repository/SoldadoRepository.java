package restfull.example.digitalinnovation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restfull.example.digitalinnovation.entity.SoldadoEntity;

public interface SoldadoRepository extends JpaRepository<SoldadoEntity,Long> {
}
