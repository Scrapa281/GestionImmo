package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

//getter et setter
@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "actif")
public class Actif {

    //pour dire que c'est id de la table
    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long Actif_id;

    private String Actif_ttr_foncier;
    private String Actif_fraction;
    private double Actif_superficie;
    private int Actif_nb_piece;
    private int Actif_num_etage;
    private String Actif_Imeuble_denom;
    private String Actif_type;

    //inclure la class adresse
    @Embedded
    private Adress adress_rue;

    //ignorer le contenu si envoyer par jsone
    @JsonIgnore
    private Instant dateCreation;

    @OneToMany(mappedBy = "actif")
    private List<EmpruntAdherent> empruntAdherentList;


}
