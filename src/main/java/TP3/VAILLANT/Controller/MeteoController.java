package TP3.VAILLANT.Controller;

import TP3.VAILLANT.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String post(@RequestParam(name = "addresse") String
                               addresse, Model model) {
        model.addAttribute("nomTemplate", addresse);
        return "meteo";
    }
}



