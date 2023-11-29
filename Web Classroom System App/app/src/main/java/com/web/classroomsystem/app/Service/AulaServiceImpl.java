package com.web.classroomsystem.app.Service;

import com.web.classroomsystem.app.Entity.Aula;
import com.web.classroomsystem.app.Repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaServiceImpl implements AulaService {

    @Autowired
    private AulaRepository repository;

    @Override
    public List<Aula> listarTodasLasAulas() {
        return repository.findAll();
    }

    @Override
    public Aula guardarAula(Aula aula) {
        return repository.save(aula);
    }

    @Override
    public Aula obtenerAulaPorId(Long id) {
        return repository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public Aula actualizarAula(Aula aula) {
        return repository.save(aula);
    }

    @Override
    public void eliminarAula(Long id) {
        repository.deleteById(Math.toIntExact(id));
    }
}
