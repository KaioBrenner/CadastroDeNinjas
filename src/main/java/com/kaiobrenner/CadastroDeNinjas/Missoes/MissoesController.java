package com.kaiobrenner.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public Optional<MissoesModel> listarMissao(@PathVariable Long id){
        return missoesService.listarMissaoPorId(id);
    }

    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    @PutMapping("/alterar")
    public  String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletar/{id}")
    public  void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissaoPorId(id);
    }
}
