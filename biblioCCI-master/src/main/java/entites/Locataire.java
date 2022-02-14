package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "locataire")
public class Locataire {
/**
 * `loc_id` int(11) NOT NULL,
  `loc_nom` varchar(55) NOT NULL,
  `loc_prenom` varchar(55) NOT NULL,
  `loc_email` varchar(128) NOT NULL,
  `loc_tel` varchar(20) NOT NULL,
  `loc_type` varchar(28) NOT NULL,
  `loc_contact_denom` varchar(28) NOT NULL,
  `loc_contact_numero` varchar(20) NOT NULL
 */
    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long idLivre;

    private String ISBN;
    private String titre;
    private String auteur;
    private String image;
    private String description;

    @OneToMany(mappedBy = "livre")
    private List<LigneEmpruntAdherent> ligneEmpruntAdherentList;

    @ManyToOne
    @JoinColumn(name ="idStock" )
    private Stock stock;

    @JsonIgnore
    private Instant dateCreation;
    @JsonIgnore
    private Instant dateLastUpdate;
}
