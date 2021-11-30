package fr.ecommerce.controller;


import fr.ecommerce.entity.Role;
import fr.ecommerce.repository.RoleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    /*
        instance a la demande
     */
    //@Autowired
    private RoleRepository roleRepository;

    /*
        instance a la demande
     */
    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // afficher la list des roles
    /*
        path => http://localost/8080 => /role
     */
    @GetMapping(path = "/role")
    public List<Role> roleList() {
        return roleRepository.findAll();
    }

    /*
        PathVariable = {id}
        recupere le role par un id
     */
    @GetMapping(path = "/role/{id}")
    public Role afficherRole(@PathVariable Long id) {
        return roleRepository.findById(id).get();
    }

    /*
         PostMapping => creations d'un role
         RequestBody => vérifie ce que cela veux dire sur internet
     */
    @PostMapping(path = "/role")
    public Role save(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    /*
        PutMapping => mettre à jour le role par l'id
     */
    @PutMapping(path = "/role/{id}")
    public Role update(@PathVariable Long id,@RequestBody Role role){
        role.setId(id);
        return roleRepository.save(role);
    }

    /*
        @DeleteMapping => supprime l'utilisateur par l'id
     */
    @DeleteMapping (path = "/role/{id}")
    public void delete (@PathVariable Long id) {
        roleRepository.deleteById(id);
    }
}
