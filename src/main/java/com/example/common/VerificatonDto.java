package com.example.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VerificatonDto {

    private LocalDateTime created;
    private LocalDateTime updated;
    @NotNull(message = "Profile ID cannot be null")
    private UUID profileId;
    @NotBlank(message = "Profile type cannot be blank")
    private String profileType;
    private String details;
    private String verificationStatus;

}

