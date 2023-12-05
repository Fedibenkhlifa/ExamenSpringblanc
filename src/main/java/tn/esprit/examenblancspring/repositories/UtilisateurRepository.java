package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    long countByClasse_Niveau(Classe.Niveau nv);
}
