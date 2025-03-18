package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import uniandes.edu.co.proyecto.modelo.IPS;
import uniandes.edu.co.proyecto.repositorio.IPSRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerIPS {

    @Autowired
    private  IPSRepository ipsRepository;

    @GetMapping("/IPS/new")
    public String  IPSForm(Model model){
        model.addAttribute("IPS", new IPS());
        return model.toString();
    }

    @PostMapping("/IPS/new/save")
    public String IPSGuardar(@ModelAttribute IPS ips) {
        ipsRepository.registrarIPS(ips.getNit(), ips.getNombre(), ips.getDireccion(), ips.getTelefono());
        return "redirect:/IPS/new";
    }
    
    
    
    
}
