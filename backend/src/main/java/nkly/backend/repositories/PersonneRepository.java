package nkly.backend.repositories;

import nkly.backend.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonneRepository extends JpaRepository<Personne, Long> {



}
