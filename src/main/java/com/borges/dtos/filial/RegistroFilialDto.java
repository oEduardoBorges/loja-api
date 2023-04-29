package com.borges.dtos.filial;

import com.borges.dtos.endereco.EnderecoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistroFilialDto {

    private String nome;
    private EnderecoDto endereco;
}
