package com.kaiobrenner.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }


    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listarID/{id}")
    public Optional<NinjaModel> listaNinjaPorId(@PathVariable Long id){
        return ninjaService.listaNinjaPorId(id);
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
