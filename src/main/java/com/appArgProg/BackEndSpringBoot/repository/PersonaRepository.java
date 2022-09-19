package com.appArgProg.BackEndSpringBoot.repository;

import com.appArgProg.BackEndSpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{

    public Object findAllById(Long id);
    
}
