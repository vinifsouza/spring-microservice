package com.ms.user.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(@NotBlank String name, @Column(unique = true) @NotBlank @Email String email) {
}
