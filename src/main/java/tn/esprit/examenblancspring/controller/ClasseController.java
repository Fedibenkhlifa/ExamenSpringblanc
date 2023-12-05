package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;
import tn.esprit.examenblancspring.services.IClasseService;

@RestController
@AllArgsConstructor
@RequestMapping("classes")
public class ClasseController {
    IClasseService classeService;
    @PostMapping("/add-utilisateur")
    public Classe addClasse(@RequestBody Classe classe) {
        Classe classe1 = classeService.addClasse(classe);
        return classe1;
    }
}
