package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour que la table adresse soit inclut dans autre table
@Embeddable

public class Adress  {

    private String adress_rue;
    private String adress_ville;
    private String adress_cd_pst;
    private String adress_pays;
}
