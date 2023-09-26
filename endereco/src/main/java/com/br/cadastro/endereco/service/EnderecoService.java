package com.br.cadastro.endereco.service;

import com.br.cadastro.endereco.model.EnderecoRequisicao;
import com.br.cadastro.endereco.model.EnderecoResponse;
import com.br.cadastro.endereco.feign.EnderecoFeigh;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnderecoService {
    private final EnderecoFeigh enderecoFeigh;

    public EnderecoResponse executa(EnderecoRequisicao requisicao){
        return enderecoFeigh.buscaEnderecoCep(requisicao.getCep());
    }
}
