package com.web.classroomsystem.app.Service;

import com.web.classroomsystem.app.Entity.Aula;

import java.util.List;

public interface AulaService {

    public List<Aula> listarTodasLasAulas();

    public Aula guardarAula(Aula aula);

    public Aula obtenerAulaPorId(Long id);

    public Aula actualizarAula(Aula aula);

    public void eliminarAula(Long id);
}



