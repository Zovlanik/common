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
public class UserDto {

    @NotBlank(message = "Secret key cannot be blank")
    private String secretKey;

    @NotNull(message = "Created date cannot be null")
    private LocalDateTime created;

    private LocalDateTime updated;

    @NotBlank(message = "First name cannot be blank")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    private LocalDateTime verifiedAt;
    private LocalDateTime archivedAt;

    private String status;

    private boolean filled;

    @NotNull(message = "Address ID cannot be null")
    private UUID addressId;
}
