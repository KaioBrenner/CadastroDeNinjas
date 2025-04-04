package com.kaiobrenner.CadastroDeNinjas.Missoes;

import com.kaiobrenner.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    public Optional<MissoesModel> listarMissaoPorId(Long id){
        return missoesRepository.findById(id);
    }

    public MissoesModel criarMissao(MissoesModel missao){
        return missoesRepository.save(missao);
    }

    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

}
