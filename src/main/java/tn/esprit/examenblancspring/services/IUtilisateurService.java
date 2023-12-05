package tn.esprit.examenblancspring.services;

import jdk.jshell.execution.Util;
import tn.esprit.examenblancspring.entities.Classe;
import tn.esprit.examenblancspring.entities.Utilisateur;

public interface IUtilisateurService {
    Utilisateur addUtilisateur(Utilisateur ut);
    public void affecterUtilisateurClasse (long idUtilisateur, long codeClasse);
    public long nbUtilisateursParNiveau(Classe.Niveau nv) ;
    }
