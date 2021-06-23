package com.apiAplicationGestion.apiAplicationGestion.controller;

import com.apiAplicationGestion.apiAplicationGestion.model.personnelMedicalModel;
import com.apiAplicationGestion.apiAplicationGestion.dao.personnelMedicalDao;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;

@RestController
public class personnelMedicalController {

    @Autowired
    private personnelMedicalDao personnelMedicalDao;
    private BCryptPasswordEncoder passwordEncoder;


    /**
     * La methode getPersonnelMedicals permet de recuperer tout les personnels medicales
     * */
    //Récupérer la liste des produits
    @RequestMapping(value = "/personnelMedicals", method = RequestMethod.GET)
    public  Iterable<personnelMedicalModel>listeProduits() {
        return personnelMedicalDao.findAll();
    }

    /**
     * La methode getPersonnelMedical permet de recupérer un personnels medicals par son id
     *
     * id: int (identifiant du personnel medical)
     **/
    @RequestMapping(value = "personnelMedicals/{id}", method = RequestMethod.GET)
    public personnelMedicalModel getPersonnelMedicalById(@PathVariable int id){
        return personnelMedicalDao.findById(id);
    }

    /**
     * La methode ajoutePersonnelMedical permet de  S   supprimer un personnel medical
     *
     * id : int (id du personnels medicals)
     **/
     @RequestMapping(value = "personnelMedicals/{id}", method = RequestMethod.DELETE)
     public void  deletePersonnelMedical(@PathVariable int id){
     personnelMedicalDao.deleteById(id);
     }
    /**
     * La methode ajoutePersonnelMedical permet d'ajouter un personnel medical
     *
     * personnelMedicalSaved : Object personnelMedicalModel (contient les données du personnel Medical)
     **/
     @RequestMapping(value = "/personnelMedicals", method = RequestMethod.POST)
     public ResponseEntity<personnelMedicalModel> ajoutePersonnelMedical(@RequestBody personnelMedicalModel personnelMedicalModel){
         String pwd= personnelMedicalModel.getPassword_personnel();
         String encrptedPwd = passwordEncoder.encode(pwd);
         personnelMedicalModel.setPassword_personnel(encrptedPwd);
        personnelMedicalModel personnelMedicalSave = personnelMedicalDao.save(personnelMedicalModel);
        if (personnelMedicalSave == null)
            return ResponseEntity.noContent().build();
        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(personnelMedicalSave.getId())
            .toUri();
            return ResponseEntity.created(location).build();
     }

    /**
     * La methode ajoutePersonnelMedical permet de mettre à joure un personnel medical
     *
     * id : int (id du personnels medicals)
     **/
    @RequestMapping(value = "personnelMedicals/{id}", method = RequestMethod.PUT)
    public void updatePersonnelMedical(@RequestBody personnelMedicalModel personnelMedicalModel){
        if (personnelMedicalModel != null){
            personnelMedicalDao.save(personnelMedicalModel);
        }
    }

}
