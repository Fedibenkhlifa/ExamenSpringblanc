package tn.esprit.examenblancspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;
import tn.esprit.examenblancspring.repositories.ClasseRepository;
import tn.esprit.examenblancspring.repositories.UtilisateurRepository;

@Service
@AllArgsConstructor
public class UtilisateurServiceimpl implements IUtilisateurService{
    UtilisateurRepository utilisateurRepository;
    ClasseRepository classeRepository;
    @Override
    public Utilisateur addUtilisateur(Utilisateur ut) {
        return utilisateurRepository.save(ut);
    }

    @Override
    public void affecterUtilisateurClasse(long idUtilisateur, long codeClasse) {
    Utilisateur utilisateur = utilisateurRepository.findById(idUtilisateur).get();
        Classe classe = classeRepository.findById(codeClasse).get();
     utilisateur.setClasse(classe);
     utilisateurRepository.save(utilisateur);
    }

    @Override
    public long nbUtilisateursParNiveau(Classe.Niveau nv) {
        return utilisateurRepository.countByClasse_Niveau(nv);
    }


}
