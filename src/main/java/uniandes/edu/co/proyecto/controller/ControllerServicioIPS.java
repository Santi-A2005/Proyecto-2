package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.modelo.Servicio;
import uniandes.edu.co.proyecto.modelo.ServicioIPS;
import uniandes.edu.co.proyecto.modelo.ServicioIPSPK;
import uniandes.edu.co.proyecto.repositorio.ServicioIPSRepository;

@RestController
public class ControllerServicioIPS {

    @Autowired
    private  ServicioIPSRepository servicioIPSRepository;

    @GetMapping("/ServicioIPS/new")
    public String  ServicioIPSForm(Model model){
        model.addAttribute("Servicio", new Servicio());
        return model.toString();
    }

    @PostMapping("/ServicioIPS/new/save")
    public String ServicioIPSGuardar(@ModelAttribute ServicioIPS servicioIPS) {
        ServicioIPSPK pk = servicioIPS.getPk();
        int Nit_EPS = pk.getNit_EPS().getNit();
        int servicio_Id = pk.getId_Servico().getId_Servicio();
        servicioIPSRepository.asignarServicioIPS(Nit_EPS, servicio_Id);
        return "redirect:/ServicioIPS/new";
    }
    
}
