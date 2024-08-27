package com.example.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MerchantDto {

    @NotNull(message = "Creator ID cannot be null")
    private UUID creatorId;

    @NotNull(message = "Created date cannot be null")
    private LocalDateTime created;

    private LocalDateTime updated;

    @NotBlank(message = "Company name cannot be blank")
    private String companyName;

    @NotBlank(message = "Company ID cannot be blank")
    private String companyId;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(regexp = "\\d{1,20}", message = "Phone number must be between 1 and 20 digits")
    private String phoneNumber;

    private LocalDateTime verifiedAt;
    private LocalDateTime archivedAt;
    private String status;
    private boolean filled;
}
