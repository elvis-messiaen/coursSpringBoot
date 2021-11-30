package fr.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//Lombok
/*
    Data => getter setter
    @NoArgsConstructor => constructeur sans arguments
    @AllArgsConstructor => construceteur full arguments
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//pour dire a java que c'est entity => l'ensemble des attribut en base de données
@Entity

public class Role implements Serializable {
    /*
        Id => defini le champs id (clef primaire)
        GeneratedValue => defini le comportement de l'id en base de données
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*
        comportement des champs => nom nul taille etc
     */
    @Column(name = "type", length = 60, nullable = false)
    private String ty;


}
