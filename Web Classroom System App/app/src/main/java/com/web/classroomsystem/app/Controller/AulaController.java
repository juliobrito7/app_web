package com.web.classroomsystem.app.Controller;

import com.web.classroomsystem.app.Entity.Aula;
import com.web.classroomsystem.app.Repository.AulaRepository;
import com.web.classroomsystem.app.Service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AulaController {

    @Autowired
    private AulaService service;

    @GetMapping({"/aulas","/"})
    public String listarAulas(Model modelo) {
        modelo.addAttribute("aulas", service.listarTodasLasAulas());
        return "aulas";
    }

    @GetMapping("/aulas/nueva")
    public String mostrarFormularioDeRegistroDeAula(Model modelo) {
        Aula aula = new Aula();
        modelo.addAttribute("aula", aula);
        return "crear_aula";
    }

    @PostMapping("/aulas")
    public String guardarAula(@ModelAttribute("aula") Aula aula) {
        service.guardarAula(aula);
        return "redirect:/aulas";
    }

    @GetMapping("/aulas/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id,Model modelo) {
        modelo.addAttribute("aula", service.obtenerAulaPorId(id));
        return "editar_aula";
    }

    @PostMapping("/aulas/{id}")
    public String actualizarAula(@PathVariable Long id,@ModelAttribute("aula") Aula aula,Model modelo) {
        Aula aulaExistente = service.obtenerAulaPorId(id);
        aulaExistente.setId(id);
        aulaExistente.setNombre_aula(aula.getNombre_aula());
        aulaExistente.setSede(aula.getSede());
        aulaExistente.setProfesor(aula.getProfesor());
        aulaExistente.setCarrera(aula.getCarrera());
        aulaExistente.setClase(aula.getClase());
        aulaExistente.setFecha(aula.getFecha());
        aulaExistente.setHora_inicio(aula.getHora_inicio());
        aulaExistente.setHora_fin(aula.getHora_fin());

        service.actualizarAula(aulaExistente);
        return "redirect:/aulas";
    }

    @GetMapping("/aulas/{id}")
    public String eliminarAula(@PathVariable Long id) {
        service.eliminarAula(id);
        return "redirect:/aulas";
    }
}

