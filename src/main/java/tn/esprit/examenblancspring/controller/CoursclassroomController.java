package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.CoursClassroom;
import tn.esprit.examenblancspring.services.ICoursclassroomService;

@RestController
@AllArgsConstructor
@RequestMapping("cours")
public class CoursclassroomController {
    ICoursclassroomService iCoursclassroomService ;
    @PostMapping("/add-coursClassroom")
    public CoursClassroom addCours(@RequestBody CoursClassroom coursClassroom) {
        CoursClassroom cours = iCoursclassroomService.addCours(coursClassroom);
        return coursClassroom;
    }
    @PutMapping("/desafCours/{idCours}")
    public void disallowCours(@PathVariable("idCours") long idCours){
iCoursclassroomService.desaffecterCoursClassroomClasse(idCours);
    }
    @GetMapping("/nbrheures")
    public long countnbr(@RequestParam("niveau")Classe.Niveau niveau, @RequestParam("specialite")CoursClassroom.Specialite specialite){
        return iCoursclassroomService.nbHeuresParSpecEtNiv(specialite,niveau);
    }
}
