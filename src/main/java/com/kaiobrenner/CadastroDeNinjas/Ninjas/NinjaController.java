package com.kaiobrenner.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado!";
    }


    @GetMapping("/listar")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Todos os ninjas";
    }

    @GetMapping("/listarID")
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
