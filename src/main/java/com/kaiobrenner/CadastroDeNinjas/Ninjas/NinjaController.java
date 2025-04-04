package com.kaiobrenner.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado!";
    }


    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Todos os ninjas";
    }

    @GetMapping("/todosID")
    public String mostrarNinjaPorId(){
        return "Mostar Ninja";
    }

    @PutMapping("alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }


    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado por Id";
    }

}
