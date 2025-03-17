package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import uniandes.edu.co.proyecto.modelo.Medico;
import uniandes.edu.co.proyecto.repositorio.MedicoRepository;

@Controller
public class ControllerMedico {

    @Autowired
    private  MedicoRepository medicoRepository;

    @GetMapping("/Medico/new")
    public String  MedicoForm(Model model){
        model.addAttribute("Medico", new Medico());
        return "MedicoNuevo";
    }

    @PostMapping("/Medico/new/save")
    public String MedicoGuardar(@ModelAttribute Medico medico) {
        medicoRepository.registrarMedico(medico.getNumeroDocumento(), medico.getTipoDocumento(), medico.getEspecialidad(), medico.getRegistroMedico(), medico.getIPS().getNit());
        return "redirect:/Medico/new";
    }
    
}
