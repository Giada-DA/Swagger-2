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



    @GetMapping("/division-info")
    public ArithmeticOperation infoDivisione(){
        String [] proprieta = new String [2];
        proprieta[0]="invariantiva";
        proprieta[1]="distributiva";
        return new ArithmeticOperation("divisione", 2, "divide il primo numero per il secondo", proprieta);
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