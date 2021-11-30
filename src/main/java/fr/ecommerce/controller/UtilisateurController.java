package fr.ecommerce.controller;


import fr.ecommerce.entity.Utilisateur;
import fr.ecommerce.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UtilisateurController {

    private UtilisateurRepository utilisateurRepository;

    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }


    @GetMapping (path = "/utilisateur")
    public List<Utilisateur> utilisateurList (){
        return utilisateurRepository.findAll();
    }

    @GetMapping (path = "/utilisateur/{id}")
    public Utilisateur recupereParId (@PathVariable Long id){
        return utilisateurRepository.findById(id).get();
    }

    @PostMapping (path = "/utilisateur")
    public Utilisateur save (@RequestBody Utilisateur  utilisateur){
        return utilisateurRepository.save(utilisateur);
    }

    @PutMapping (path = "/utilisateur/{id}")
    public Utilisateur update (@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        utilisateur.setId(id);
        return utilisateurRepository.save(utilisateur);
    }

    @DeleteMapping (path = "/utilisateur/{id}")
    public void delete (@PathVariable Long id) {
        utilisateurRepository.deleteById(id);
    }
}
