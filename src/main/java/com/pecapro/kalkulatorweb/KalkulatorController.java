package com.pecapro.kalkulatorweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KalkulatorController {

    @GetMapping("/kalkulator")
    public String kalkulator(
            @RequestParam(required = false) Double a,
            @RequestParam(required = false) Double b,
            @RequestParam(required = false) String operacija,
            Model model) {

        if (a != null && b != null && operacija != null) {
            double rezultat = 0;
            boolean greska = false;
            String poruka = "";

            switch (operacija) {
                case "sabiranje" -> rezultat = a + b;
                case "oduzimanje" -> rezultat = a - b;
                case "mnozenje" -> rezultat = a * b;
                case "deljenje" -> {
                    if (b == 0) {
                        greska = true;
                        poruka = "Ne možeš deliti sa nulom!";
                    } else {
                        rezultat = a / b;
                    }
                }
                default -> {
                    greska = true;
                    poruka = "Nepoznata operacija";
                }
            }

            model.addAttribute("rezultat", rezultat);
            model.addAttribute("greska", greska);
            model.addAttribute("poruka", poruka);
        }

        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("operacija", operacija);
        return "kalkulator";
    }
}