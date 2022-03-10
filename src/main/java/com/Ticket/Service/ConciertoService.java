/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ticket.Service;


import com.Ticket.Entity.Concierto;
import com.Ticket.Repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConciertoService implements IConciertoService{
    @Autowired
    private ConciertoRepository conciertoRepository; 

    @Override
    public List<Concierto> getlistaConcierto() {
       return (List<Concierto>) conciertoRepository.findAll();
    }

    @Override
    public void guardarConcierto(Concierto concierto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Concierto getConciertoporID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void borrar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
