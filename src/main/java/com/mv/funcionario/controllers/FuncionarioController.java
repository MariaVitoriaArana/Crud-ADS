package com.mv.funcionario.controllers;


import com.mv.funcionario.models.FuncionarioModel;
import com.mv.funcionario.services.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/funcinarios")

public class FuncionarioController {

    @Autowired
    private FuncionarioServices funcionarioServices;

    @GetMapping
    public List<FuncionarioModel> findAll(){
        return funcionarioServices.findAll();
    }

    @GetMapping("/{id}")
    public FuncionarioModel buscarPorId(@PathVariable Long id){
        return funcionarioServices.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(Long id){
        funcionarioServices.deletar(id);
    }

    @PostMapping
    public FuncionarioModel criarFuncionario(@RequestBody FuncionarioModel funcionarioModel){
        return  funcionarioServices.criarPessoa(funcionarioModel);
    }

    @PutMapping("/{id}")
    public FuncionarioModel atualizar(@PathVariable Long id,@RequestBody FuncionarioModel funcionarioModel){
        return funcionarioServices.atualizar(id,funcionarioModel);
    }


}
