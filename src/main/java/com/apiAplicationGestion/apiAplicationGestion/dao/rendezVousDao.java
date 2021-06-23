package com.apiAplicationGestion.apiAplicationGestion.dao;

import com.apiAplicationGestion.apiAplicationGestion.model.rendezVousModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface rendezVousDao extends JpaRepository<rendezVousModel, Integer> {
    @Override
    List<rendezVousModel> findAll();

    @Override
    Optional<rendezVousModel> findById(Integer integer);

    @Override
    <S extends rendezVousModel> S save(S s);

    @Override
    void deleteById(Integer integer);
}
