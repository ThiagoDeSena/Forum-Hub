package br.alura.ForumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosAtuzalizacaoTopico(
        @NotBlank
        String mensagem,
        @NotBlank
        String titulo) {
}
