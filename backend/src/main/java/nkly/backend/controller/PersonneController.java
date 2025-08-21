package nkly.backend.controller;


import nkly.backend.model.Personne;
import nkly.backend.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Personne")
public class PersonneController {

    @Autowired
    private PersonneRepository repository;


    @GetMapping("/getAllPersonne")
    private List<Personne> getAllPersonne(){
        return repository.findAll();
    }


}
