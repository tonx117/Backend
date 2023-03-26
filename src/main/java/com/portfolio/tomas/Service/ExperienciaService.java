package com.portfolio.tomas.Service;

import com.portfolio.tomas.Entity.Experiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.tomas.Repository.ExperienciaRepository;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    ExperienciaRepository rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }        
    
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreExperiencia(String nombreExperiencia){
        return rExperiencia.findByNombreExperiencia(nombreExperiencia);
    }
    
    public void save(Experiencia experienc){
        rExperiencia.save(experienc);
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existByNombreExperiencia(String nombreExperiencia){
        return rExperiencia.existsByNombreExperiencia(nombreExperiencia);
    }
}
