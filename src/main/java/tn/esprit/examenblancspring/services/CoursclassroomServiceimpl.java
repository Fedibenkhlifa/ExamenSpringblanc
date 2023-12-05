package tn.esprit.examenblancspring.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.CoursClassroom;
import tn.esprit.examenblancspring.repositories.CoursClassroomRepository;

import java.util.List;

@Service
@EnableScheduling
@AllArgsConstructor

public class CoursclassroomServiceimpl implements ICoursclassroomService{
    CoursClassroomRepository coursClassroomRepository;


    @Override
    public CoursClassroom addCours(CoursClassroom coursClassroom) {
        return coursClassroomRepository.save(coursClassroom);
    }

    @Override
    public void desaffecterCoursClassroomClasse(long idCours) {
CoursClassroom coursClassroom =coursClassroomRepository.findById(idCours).get();
coursClassroom.setClasse(null);
coursClassroomRepository.save(coursClassroom);
    }

    @Scheduled(fixedRate = 60000)
    public void archiverCoursClassrooms() {
        List<CoursClassroom> coursNonArchives = coursClassroomRepository.findByArchiveFalse();

        // Archiver chaque coursClassroom
        for (CoursClassroom coursClassroom : coursNonArchives) {
            coursClassroom.setArchive(true);
            coursClassroomRepository.save(coursClassroom);
        }
    }

    @Override
    public long nbHeuresParSpecEtNiv(CoursClassroom.Specialite sp, Classe.Niveau nv) {
        return coursClassroomRepository.findNbHeuresBySpecialiteAndNiveau(sp,nv);
    }


}

