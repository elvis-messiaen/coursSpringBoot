package fr.ecommerce.repository;


import fr.ecommerce.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
    lors de l'appel au repository
    il créer a la demande l'Object => ici de type Utilisateur
    et permet grace au signature dans le repostory et ceux recuperer depuis l'interface JpaRepository
    exemple besoin afficher utilisateur avec id 1 dans le controller
    => creer une utilisateur => Utilisateur utilsateur = new Utilisateur (1, "nom", "prenom",etc etc); creation a la demande

 */

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
    Utilisateur findById(int id);

    public Utilisateur save (Utilisateur utilisateur);
}
