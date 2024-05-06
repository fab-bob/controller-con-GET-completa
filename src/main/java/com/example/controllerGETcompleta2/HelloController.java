package com.example.controllerGETcompleta2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloController {
    @GetMapping(path = "/ciao")
    public String ciao() {
        return ("ciao!");
    }

    @GetMapping(path = "/ciao/{provincia}")
    public User ciaoNomeProvincia(
            @PathVariable String provincia,
            @RequestParam String nome
    ) {
        return new User(
                nome,
                provincia,
                "Ciao " + nome + ", com'è il tempo in " + provincia + "?"
        );
    }
}
