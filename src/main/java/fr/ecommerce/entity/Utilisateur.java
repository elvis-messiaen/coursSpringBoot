package fr.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String email;

    /*
        OneToOne => unidirectionelle =>  Uitlisateeur connais l'id du role
        Mais le role ne connais pas depuis la classe role L'utilisateur
     */

    @OneToOne
    private Role role;
}
