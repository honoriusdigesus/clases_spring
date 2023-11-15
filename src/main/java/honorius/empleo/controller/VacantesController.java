package honorius.empleo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
    @GetMapping("/view/{id}")
    public String verDetalles(@PathVariable("id") int idVacante, Model model) {
        System.out.print("IdVacantes: " + idVacante);
        model.addAttribute("idVacante", idVacante);

        //Buscar los detalles de la vacante en la base de datos
        return "vacantes/detalles";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int idVacante, Model model) {
        System.out.println("Vacantes eliminada: " + idVacante);
        model.addAttribute("idVacante", idVacante);
        return "mensaje";
    }
}
