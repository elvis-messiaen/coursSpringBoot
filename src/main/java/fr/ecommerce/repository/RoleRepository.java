package fr.ecommerce.repository;


import fr.ecommerce.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    definir l'ensemble des signature pour interaction avec la base de données => crud
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
/*
    signature de methode pour lire le role par un id
 */
    Role findById(int id);
/*
    sauvegarde le role
 */
    Role save(Role role);
}
