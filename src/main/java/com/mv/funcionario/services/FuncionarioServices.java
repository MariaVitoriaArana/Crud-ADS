package com.mv.funcionario.services;

import com.mv.funcionario.models.FuncionarioModel;
import com.mv.funcionario.repositores.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    // BUSCAR TODOS
    public List<FuncionarioModel> findAll() {
        return funcionarioRepository.findAll();
    }

    // BUSCAR POR ID
    public FuncionarioModel buscarPorId(Long id) {
        return funcionarioRepository.findById(id).get();
    }

    // CRIAR
    public FuncionarioModel criarFuncionario(FuncionarioModel funcionarioModel) {
        return funcionarioRepository.save(funcionarioModel);
    }

    // DELETAR
    public void deletar(Long id) {
        funcionarioRepository.deleteById(id);
    }

    // ATUALIZAR
    public FuncionarioModel atualizar(Long id, FuncionarioModel funcionarioModel) {

        FuncionarioModel func = funcionarioRepository.findById(id).get();

        func.setNome(funcionarioModel.getNome());
        func.setCpf(funcionarioModel.getCpf());

        return funcionarioRepository.save(func);
    }
}
