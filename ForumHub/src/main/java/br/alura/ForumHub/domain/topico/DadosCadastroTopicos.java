package br.alura.ForumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DadosCadastroTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {


}
