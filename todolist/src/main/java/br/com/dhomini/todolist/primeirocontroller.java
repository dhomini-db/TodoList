package br.com.dhomini.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")



public class primeirocontroller {
    @GetMapping("/")



    public String primeiraMensagem(){
        return "funcionou";
    }

    public int numero(){
        return 
    }
}