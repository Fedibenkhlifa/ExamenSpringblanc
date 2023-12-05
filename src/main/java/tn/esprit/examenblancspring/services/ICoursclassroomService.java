package tn.esprit.examenblancspring.services;

import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.CoursClassroom;

public interface ICoursclassroomService {
    CoursClassroom addCours(CoursClassroom coursClassroom);
    public void desaffecterCoursClassroomClasse(long idCours);
    public void archiverCoursClassrooms();
    public long nbHeuresParSpecEtNiv(CoursClassroom.Specialite sp, Classe.Niveau nv);
}
