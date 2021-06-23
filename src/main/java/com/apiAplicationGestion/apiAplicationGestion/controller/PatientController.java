package com.apiAplicationGestion.apiAplicationGestion.controller;

import com.apiAplicationGestion.apiAplicationGestion.dao.PatientDao;
import com.apiAplicationGestion.apiAplicationGestion.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {

    @Autowired
    private PatientDao patientDao;
    @Autowired


    // La methode permet de recuperer tout les Patients
    @RequestMapping(value = "/Patients", method = RequestMethod.GET)
    public List<PatientModel> getPatients(){return patientDao.findAll();}

    // La methode permet de recuperer un Patient par son id
    @RequestMapping(value = "/Patients/{id}", method = RequestMethod.GET)
    public Optional<PatientModel> getPatient(@PathVariable int id) {
        return patientDao.findById(id);
    }

    //Methode permet d'ajouter un patient
    @RequestMapping(value = "/Patients", method = RequestMethod.POST)
    public ResponseEntity<PatientModel> ajoutePatient(@RequestBody PatientModel patientModel){
        PatientModel patientModeSave = patientDao.save(patientModel);
        if (patientModeSave == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(patientModeSave.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    // Methode permet de supprimer un patient
    @RequestMapping(value = "/Patients/{id}", method = RequestMethod.DELETE)
    public void deletePatient(@PathVariable int id){
        patientDao.deleteById(id);
    }


    /*
    @RequestMapping(value = "/Patients/{id}", method = RequestMethod.PUT)
    public void updatePatient(@PathVariable int id, @RequestBody PatientModel patientModel){
        patientDao.PatientUpdate(id, patientModel);
    }

    */

}
