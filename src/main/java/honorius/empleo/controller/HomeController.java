package honorius.empleo.controller;

import honorius.empleo.model.Vacante;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String mostrarHome(Model model) {
        model.addAttribute("mensaje", "Hello Word - Spring Boot");
        model.addAttribute("fecha", new Date());
        String nombre = "Honorius di Gesus";
        Integer edad = 24;
        model.addAttribute("nombre", nombre);
        model.addAttribute("edad", edad);
        return "home";
    }

    @GetMapping("/listado")
    public String mostrarListado(Model model) {
        List<String> lista = new LinkedList<String>();
        lista.add("Ingeniero electrónico");
        lista.add("Diseñador gráfico");
        lista.add("Contador público");
        model.addAttribute("listaEmpleos", lista);
        return "listado";
    }

    @GetMapping("/vacantes")
    public String mostrarDetalle(Model model) {
        Vacante vacante = new Vacante();
        vacante.setNombre("Ingeniero de datos");
        vacante.setDescripcion("Se requiere ingeniero para analizar los datos de la empresa");
        vacante.setFecha(new Date());
        vacante.setSalario(150000.0);
        model.addAttribute("vacante", vacante);
        return "vacantes";
    }

    @GetMapping("/vacantesall")
    private String getAllVacantes(Model model){
        List<Vacante> todasVacantes = getVacantes();
        model.addAttribute("vacantesAll", todasVacantes);
        return "vacantesall";
    }

    private List<Vacante> getVacantes() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        List<Vacante> lista = new LinkedList<>();
        try {
            Vacante vacante1 = new Vacante();
            vacante1.setId(1);
            vacante1.setNombre("Ingeniero civil");
            vacante1.setDescripcion("Solicitamos ingeniero civil para diseñar puente peatonal");
            vacante1.setFecha(sdf.parse("10-10-2023"));
            vacante1.setSalario(100000.0);

            Vacante vacante2 = new Vacante();
            vacante2.setId(2);
            vacante2.setNombre("Contador Público");
            vacante2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia");
            vacante2.setFecha(sdf.parse("10-07-2023"));
            vacante2.setSalario(100000.0);

            Vacante vacante3 = new Vacante();
            vacante3.setId(3);
            vacante3.setNombre("Diseñador");
            vacante3.setDescripcion("Empresa importante solicita Diseñador con 5 años de experiencia");
            vacante3.setFecha(sdf.parse("10-11-2023"));
            vacante3.setSalario(100000.0);

            Vacante vacante4 = new Vacante();
            vacante4.setId(4);
            vacante4.setNombre("Ingeniero electrónico");
            vacante4.setDescripcion("Empresa importante solicita Ingeniero electrónico con 5 años de experiencia");
            vacante4.setFecha(sdf.parse("10-10-2023"));
            vacante4.setSalario(100000.0);

            Vacante vacante5 = new Vacante();
            vacante5.setId(5);
            vacante5.setNombre("Conductor");
            vacante5.setDescripcion("Empresa importante solicita Conductor con 5 años de experiencia");
            vacante5.setFecha(sdf.parse("10-10-2023"));
            vacante5.setSalario(120000.0);

            lista.add(vacante1);
            lista.add(vacante2);
            lista.add(vacante3);
            lista.add(vacante4);
            lista.add(vacante5);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
