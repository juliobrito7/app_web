package com.web.classroomsystem.app.Repository;

import com.web.classroomsystem.app.Entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
