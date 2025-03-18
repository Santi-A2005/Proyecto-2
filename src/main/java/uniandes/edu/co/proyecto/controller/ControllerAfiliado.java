package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.modelo.Afiliado;
import uniandes.edu.co.proyecto.repositorio.AfiliadoRepository;

@RestController
public class ControllerAfiliado {

    @Autowired
    private  AfiliadoRepository afiliadoRepository;

    @GetMapping("/Afiliado/new")
    public String  AfiliadoForm(Model model){
        model.addAttribute("Afiliado", new Afiliado());
        return model.toString();
    }

    @PostMapping("/Afiliado/new/save")
    public String AfiliadoGuardar(@ModelAttribute Afiliado afiliado) {
        afiliadoRepository.registrarAfiliado(afiliado.getNumeroDocumento(), afiliado.getTipoDocumento(), afiliado.getNombre(), afiliado.getNumeroTelefonico(), 
        afiliado.getFechaNacimiento(), afiliado.getDireccion());
        return "redirect:/Afiliado/new";
    }
    
}
