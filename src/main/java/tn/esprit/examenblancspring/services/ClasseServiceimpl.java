package tn.esprit.examenblancspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;
import tn.esprit.examenblancspring.repositories.ClasseRepository;

@Service
@AllArgsConstructor
public class ClasseServiceimpl implements IClasseService{
ClasseRepository classeRepository;
    @Override
    public Classe addClasse(Classe classe) {
        return classeRepository.save(classe);
    }

}
