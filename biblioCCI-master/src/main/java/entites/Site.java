package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "site")
public class Site {

    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long site_id;

    private String site_nom;

    @ManyToOne
    @JoinColumn(name = "actif")
    private Actif actif;

    @OneToMany(mappedBy ="empruntAdherent" )
    List<LigneEmpruntAdherent> ligneEmpruntAdherentList;

}
