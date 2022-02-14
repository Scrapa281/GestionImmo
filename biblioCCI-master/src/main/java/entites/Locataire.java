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

    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long loc_id;

    private String loc_nom;
    private String loc_prenom;
    private String loc_email;
    private String loc_tel;
    private String loc_type;
    private String loc_contact_denom;
    private String loc_contact_numero;



    @OneToMany(mappedBy = "locataire")
    private List<LigneEmpruntAdherent> ligneEmpruntAdherentList;

    @ManyToOne
    @JoinColumn(name ="idStock" )
    private Stock stock;

    @JsonIgnore
    private Instant dateCreation;
    @JsonIgnore
    private Instant dateLastUpdate;
}
