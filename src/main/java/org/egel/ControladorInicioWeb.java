package org.egel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by campitos on 2/03/17.
 */
@Controller
public class ControladorInicioWeb {

    @GetMapping("/hola")
    public String hola(){
        return "index.html";
    }
}
