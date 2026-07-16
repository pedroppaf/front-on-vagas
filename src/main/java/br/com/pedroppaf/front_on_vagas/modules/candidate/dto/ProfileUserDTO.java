package br.com.pedroppaf.front_on_vagas.modules.candidate.dto;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileUserDTO {

    private String email;
    private UUID id;
    private String description;
    private String username;
    private String name;
}
