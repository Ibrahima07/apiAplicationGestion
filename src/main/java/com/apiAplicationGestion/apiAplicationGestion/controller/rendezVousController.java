package com.apiAplicationGestion.apiAplicationGestion.controller;


import com.apiAplicationGestion.apiAplicationGestion.dao.rendezVousDao;
import com.apiAplicationGestion.apiAplicationGestion.model.rendezVousModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
public class rendezVousController {

    @Autowired
    private rendezVousDao rendezVousDao;

    @RequestMapping(value = "/rendezVous", method = RequestMethod.GET)
    public List<rendezVousModel> getRendezVouss(){
        return rendezVousDao.findAll();
    }


    @RequestMapping(value = "/rendezVous/{id}", method = RequestMethod.GET)
    public Optional<rendezVousModel> getRendezVousById(@PathVariable int id){
        return rendezVousDao.findById(id);
    }

    /*@RequestMapping(value = "/rendezVous/{id}", method = RequestMethod.PUT)
    public void redezVousUpdate(@PathVariable int id, @RequestBody rendezVousModel rendezVousModelU){
        rendezVousDao.redezVousUpdate(id, rendezVousModelU);
    }*/

    @RequestMapping(value = "/rendezVous", method = RequestMethod.POST)
    public ResponseEntity<rendezVousModel> fixedRendezVous(@RequestBody rendezVousModel rendezVousModel){
        rendezVousModel rendezVousModelSaved = rendezVousDao.save(rendezVousModel);
        if (rendezVousModelSaved == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(rendezVousModelSaved.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @RequestMapping(value = "/rendezVous/{id}", method = RequestMethod.DELETE)
    public void deleteRendezVous(@PathVariable int id){
        rendezVousDao.deleteById(id);
    }

}
