package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.modelo.RegistroOrdenServicio;
import uniandes.edu.co.proyecto.repositorio.RegistroOrdenServicioRepository;

@RestController
public class ControllerRegistroOrdenServicio {

    @Autowired
    private  RegistroOrdenServicioRepository RegistroRepository;

    @GetMapping("/RegistroOrdenServicio/new")
    public String  RegistroOSForm(Model model){
        model.addAttribute("RegistroOrdenServicio", new RegistroOrdenServicio());
        return model.toString();
    }

    @PostMapping("/RegistroOrdenServicio/new/save")
    public String RegistroOSGuardar(@ModelAttribute RegistroOrdenServicio registro) {
        RegistroRepository.insertarOrdenServicio(registro.getEstado(), registro.getFecha(), registro.getId_Orden().getId(), registro.getId_Servicio().getId_Servicio());
        return "redirect:/RegistroOrdenServicio/new";
    }
    
}
