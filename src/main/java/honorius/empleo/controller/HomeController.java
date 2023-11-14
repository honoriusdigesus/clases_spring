package honorius.empleo.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {
//    @GetMapping("/")
//    public String mostrarHome(Model model) {
//        model.addAttribute("mensaje", "Hello Word - Spring Boot");
//        model.addAttribute("fecha",new Date());
//        String nombre = "Honorius di Gesus";
//        Integer edad = 24;
//        model.addAttribute("nombre", nombre);
//        model.addAttribute("edad", edad);
//        return "home";
//    }

    @GetMapping("/listado")
    public String mostrarListado(Model model) {
        List<String> lista = new LinkedList<String>();
        lista.add("Ingeniero electrónico");
        lista.add("Diseñador gráfico");
        lista.add("Contador público");
        model.addAttribute("listaEmpleos", lista);
        return "listado";
    }
}
