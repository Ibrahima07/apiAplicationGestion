package com.apiAplicationGestion.apiAplicationGestion.dao;

import com.apiAplicationGestion.apiAplicationGestion.model.personnelMedicalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface personnelMedicalDao  extends JpaRepository<personnelMedicalModel, Integer> {
     List<personnelMedicalModel>findAll();

     personnelMedicalModel findById(int id);

     @Override
     <S extends personnelMedicalModel> S save(S s);

     @Override
     void deleteById(Integer integer);

     /*personnelMedicalModel personnelMedicalfindByNomPernom(String nomPrenom);

     personnelMedicalModel personnelMedicalUpdate(int id, personnelMedicalModel personnelMedicalModel);
     void deleteById(int id);*/
}
