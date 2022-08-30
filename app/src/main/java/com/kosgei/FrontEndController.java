package com.kosgei;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {

    @GetMapping("/")
    public String serveFrontEnd() {
        System.out.println("SERVING FRONT END..OK");
        return "index.html";
    }

    @GetMapping("/error")
    public void errorHandling() {
        System.out.println("Error in rendering...NOT OK");
    }
}
