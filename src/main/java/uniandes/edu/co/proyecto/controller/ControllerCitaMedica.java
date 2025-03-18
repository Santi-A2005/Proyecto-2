package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.proyecto.modelo.CitaMedica;
import uniandes.edu.co.proyecto.repositorio.CitaMedicaRepository;


@RestController
public class ControllerCitaMedica {

    @Autowired
    private  CitaMedicaRepository citaRepository;

    @GetMapping("/CitasMedicas/new")
    public String  CitaMedicaForm(Model model){
        model.addAttribute("Servicio", new CitaMedica());
        return model.toString();
    }

    @PostMapping("/CitasMedicas/new/save")
    public String CitaMedicaGuardar(@ModelAttribute CitaMedica citaMedica) {
        citaRepository.agregarCita(citaMedica.getFecha(), citaMedica.getHora(), citaMedica.getEstado(), citaMedica.getMedico().getNumeroDocumento(), citaMedica.getAfiliado().getNumeroDocumento());
        return "redirect:/CitasMedicas/new";
    }

    @GetMapping("/CitaMedica")
    public String getCitas4(Model model, @ModelAttribute CitaMedica citaChequear) {
        model.addAttribute("CitasMedicas", citaRepository.consultarDisponibilidad(citaChequear.getFecha()));
        return "CitasMedicas";
    }
    
    
}
