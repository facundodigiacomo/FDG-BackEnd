package com.appArgProg.BackEndSpringBoot.service;


import com.appArgProg.BackEndSpringBoot.model.Persona;
import com.appArgProg.BackEndSpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRep;
    
    
    @Override
    public List<Persona> verPersonas() {
        return persoRep.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRep.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRep.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRep.findById(id).orElse(null);
    }


}
