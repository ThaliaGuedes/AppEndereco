package com.br.cadastro.endereco.controller;

import com.br.cadastro.endereco.model.EnderecoRequisicao;
import com.br.cadastro.endereco.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/endereco")
@RestController
@RequiredArgsConstructor
public class EnderecoController {
    private final EnderecoService enderecoService;

    @GetMapping("/consulta/{cep}")
    public ResponseEntity consultaCep(@PathVariable("cep") String cep) {
        EnderecoRequisicao enderecoRequisicao = new EnderecoRequisicao();
        enderecoRequisicao.setCep(cep);
        return ResponseEntity.ok(enderecoService.executa(enderecoRequisicao));
    }

}
