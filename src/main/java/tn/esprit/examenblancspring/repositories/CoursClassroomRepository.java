package tn.esprit.examenblancspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.CoursClassroom;

import java.util.List;

public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Long> {
    List<CoursClassroom> findByArchiveFalse();

    @Query("SELECT c.nbHeures FROM CoursClassroom c WHERE c.specialite = :specialite AND c.classe.niveau = :niveau")
    Long findNbHeuresBySpecialiteAndNiveau(@Param("specialite") CoursClassroom.Specialite specialite, @Param("niveau") Classe.Niveau niveau);
}