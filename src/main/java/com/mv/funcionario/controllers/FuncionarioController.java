package com.mv.funcionario.controllers;

import com.mv.funcionario.models.FuncionarioModel;
import com.mv.funcionario.services.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioServices funcionarioServices;

    // BUSCAR TODOS
    @GetMapping
    public List<FuncionarioModel> findAll() {
        return funcionarioServices.findAll();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public FuncionarioModel buscarPorId(@PathVariable Long id) {
        return funcionarioServices.buscarPorId(id);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        funcionarioServices.deletar(id);
    }

    // CRIAR
    @PostMapping
    public FuncionarioModel criarFuncionario(@RequestBody FuncionarioModel funcionarioModel) {
        return funcionarioServices.criarFuncionario(funcionarioModel);
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    public FuncionarioModel atualizar(
            @PathVariable Long id,
            @RequestBody FuncionarioModel funcionarioModel) {

        return funcionarioServices.atualizar(id, funcionarioModel);
    }
}
```
