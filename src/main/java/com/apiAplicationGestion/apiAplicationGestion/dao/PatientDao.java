package com.apiAplicationGestion.apiAplicationGestion.dao;

import com.apiAplicationGestion.apiAplicationGestion.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface PatientDao extends JpaRepository<PatientModel, Integer> {
    @Override
    List<PatientModel> findAll();

    @Override
    Optional<PatientModel> findById(Integer integer);

    @Override
    void deleteById(Integer integer);
    @Override
    <S extends PatientModel> S save(S s);

}
