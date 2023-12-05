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
public class Classe implements Serializable{
    public enum Niveau { PREMIERE, DEUXIEME, TROISIEME, QUATRIEME, CINQUIEME };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeClasse;
    private String titre ;
    @Enumerated(EnumType.STRING)

    private Niveau niveau;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "classe")
    private Set<CoursClassroom> coursClassrooms;



}
