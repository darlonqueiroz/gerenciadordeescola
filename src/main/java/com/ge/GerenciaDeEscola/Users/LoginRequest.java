package com.ge.GerenciaDeEscola.Users;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty(message = "Email é Obrigatório") String email, @NotEmpty(message = "Senha é Obrigatório") String password) {
}
