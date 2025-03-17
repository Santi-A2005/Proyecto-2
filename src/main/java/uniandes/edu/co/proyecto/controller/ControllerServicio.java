package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Servicio;
import uniandes.edu.co.proyecto.repositorio.ServicioRepository;

@Controller
public class ControllerServicio {

    @Autowired
    private  ServicioRepository servicioRepository;

    @GetMapping("/Servicio/new")
    public String  IPSForm(Model model){
        model.addAttribute("Servicio", new Servicio());
        return "ServicioNuevo";
    }

    @PostMapping("/IPS/Servicio/save")
    public String IPSGuardar(@ModelAttribute Servicio servicio) {
        servicioRepository.registrarServicio(servicio.getServicio());
        return "redirect:/Servicio/new";
    }
    
}
