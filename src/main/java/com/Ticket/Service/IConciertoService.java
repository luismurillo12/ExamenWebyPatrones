/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Ticket.Service;

import com.Ticket.Entity.Concierto;
import java.util.List;

public interface IConciertoService {

    public List<Concierto> getlistaConcierto();

    public void guardarConcierto(Concierto concierto);

    public Concierto getConciertoporID(long id);

    public void borrar(long id);

}
