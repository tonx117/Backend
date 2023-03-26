package com.portfolio.tomas.Repository;

import com.portfolio.tomas.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreEducacion(String nombreEducacion);
    public boolean existsByNombreEducacion(String nombreEducacion);
}
