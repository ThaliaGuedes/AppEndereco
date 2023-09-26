package com.br.cadastro.endereco.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoRequisicao {
    private String cep;

    public void setCep(String cep) {
        this.cep = cep;
    }
}
