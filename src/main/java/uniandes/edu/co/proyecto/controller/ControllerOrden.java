package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.modelo.Orden;
import uniandes.edu.co.proyecto.repositorio.OrdenRepository;

@RestController
public class ControllerOrden {

    @Autowired
    private  OrdenRepository ordenRepository;

    @GetMapping("/Orden/new")
    public String  OrdenForm(Model model){
        model.addAttribute("Orden", new Orden());
        return model.toString();
    }

    @PostMapping("/Orden/new/save")
    public String OrdenGuardar(@ModelAttribute Orden orden) {
        ordenRepository.registrarOrden(orden.getFecha(), orden.getEstado(), orden.getMedico().getNumeroDocumento(), orden.getAfiliado().getNumeroDocumento());
        return "redirect:/Orden/new";
    }
}
