package com.mv.funcionario.services;

import com.mv.funcionario.models.FuncionarioModel;
import com.mv.funcionario.repositores.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class FuncionarioServices {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> findAll(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel buscarPorId (Long id){
        return funcionarioRepository.findById(id).get();
    }

    public FuncionarioModel criarPessoa(FuncionarioModel funcionarioModel){
        return funcionarioRepository.save(funcionarioModel);
    }
}
