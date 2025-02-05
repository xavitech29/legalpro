package com.proyecto.legalpro.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CasoControlador {
	
	 @GetMapping("/inicio")
	    public String mostrarPlantilla(Model model) {
	       
	        return "plantilla";
	    }

}
