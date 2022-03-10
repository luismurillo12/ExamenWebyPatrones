/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ticket.controller;

import com.Ticket.Entity.Concierto;
import com.Ticket.Service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConciertoController {
    @Autowired
    private IConciertoService conciertoService; 
    
    @GetMapping({"/conciertos"})
    public String index(Model model){
        List<Concierto> listaConcierto = conciertoService.getlistaConcierto(); 
        model.addAttribute("concierto", listaConcierto); 
        
        return"Concierto"; 
    }
     @GetMapping("/NConcierto")
    public String crearPersona(Model model) {
        model.addAttribute("concierto", new Concierto());//donde vea personas el va a crear un objecto de tipo persona
        return "crearConcierto";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Concierto concierto) {
        conciertoService.guardarConcierto(concierto);
        return "redirect:/conciertos";
    }
}
