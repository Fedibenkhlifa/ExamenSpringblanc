package tn.esprit.examenblancspring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;
import tn.esprit.examenblancspring.services.IUtilisateurService;

@RestController
@AllArgsConstructor
@RequestMapping("utilisateurs")
public class UtilisateurController {
IUtilisateurService utilisateurService;
    @PostMapping("/add-utilisateur")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur ut) {
        Utilisateur utilisateur = utilisateurService.addUtilisateur(ut);
        return utilisateur;
    }
    @PostMapping("/affecterUtACl")
    public void affecterUtilisateur(@RequestParam("idUtilisateur") long idUtilisateur, @RequestParam("Codeclasse") long codeClasse){
        utilisateurService.affecterUtilisateurClasse(idUtilisateur, codeClasse);
    }
    @GetMapping("/countnb")
    public long countnbr(@RequestParam("niveau")Classe.Niveau niveau){
        return utilisateurService.nbUtilisateursParNiveau(niveau);

    }
}
