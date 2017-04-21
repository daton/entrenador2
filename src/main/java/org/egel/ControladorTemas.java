package org.egel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by campitos on 17/03/17.
 */

@RestController
@CrossOrigin
public class ControladorTemas {
    @Autowired RepositorioPregunta pregunta;
    @RequestMapping("/tema")
    public ArrayList<Pregunta> buscarTodos()throws Exception {

        return (ArrayList<Pregunta>) pregunta.findAll();

    }
    @RequestMapping("/tema/{area}")
    public ArrayList<Pregunta> buscarPorArea(@PathVariable String area)throws Exception {

        return (ArrayList<Pregunta>) pregunta.findByArea(area);

    }

    @RequestMapping("/tema/modificar/{area}")
    public String modificar(@PathVariable String area)throws Exception {

          for(Pregunta p: pregunta.findAll()){
              if(p.getTema().contains(area)){
                  p.setArea(area);
                  pregunta.save(p);
              }
          }
        return "Agregada la area" +area;

    }






}
