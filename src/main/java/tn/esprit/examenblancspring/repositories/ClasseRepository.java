package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
