package br.com.pedroppaf.front_on_vagas.modules.candidate.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Token {

    private String access_token;
    private List<String> roles;
    private Long expires_in;

}
