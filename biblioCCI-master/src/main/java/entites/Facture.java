package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "facture")

public class Facture {
/**
 * 
  `facture_num` int(11) NOT NULL,
  `` int(11) NOT NULL,
  `facture_mtn_ttc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long facture_id;

    private String facture_date_emis;
    private String facture_num ;
    private double facture_mtn_ht ;
    private double facture_mtn_ttc;

    
    @OneToMany(mappedBy = "facture")
    List<Livre> livreList;
}