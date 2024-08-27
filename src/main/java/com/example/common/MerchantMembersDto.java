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
public class MerchantMembersDto {

    @NotNull(message = "User ID cannot be null")
    private UUID userId;

    @NotNull(message = "Created date cannot be null")
    private LocalDateTime created;

    private LocalDateTime updated;

    @NotNull(message = "Merchant ID cannot be null")
    private UUID merchantId;

    @NotBlank(message = "Member role cannot be blank")
    private String memberRole;

    private String status;
}
