package com.portfolio.tomas.Repository;

import com.portfolio.tomas.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer>{
    public Optional<Skills> findByNombreSkill(String nombreSkill);
    public boolean existsByNombreSkill(String nombreSkill);
}
