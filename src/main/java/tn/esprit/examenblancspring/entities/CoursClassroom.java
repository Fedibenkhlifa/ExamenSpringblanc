package tn.esprit.examenblancspring.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoursClassroom implements Serializable{
    public enum Specialite { INFORMATIQUE, GENIECIVIL, AGRICULTURE };
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCours;
    private String nom;
    private long nbHeures;
    private boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    Classe classe;

}
