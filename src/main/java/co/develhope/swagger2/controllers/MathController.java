package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping
    public String welcomeMathMsg(){
        return "Welcome";
    }

    ArithmeticOperation divisione = new ArithmeticOperation("divisione", 2, "dividendo diviso divisore = quoziente", new String[] {"['invariantiva', 'distributiva'}"});

    @GetMapping("/division-info")
    public String infoDivisione(){
        return divisione.getDescrizione();
    }

    @GetMapping("/multiplication")
    public int moltiplicazione(int a, int b){
        return a * b;
    }

    @GetMapping("/square/{n}")
    public int quadrato(int n){
        return n * n;
    }






}