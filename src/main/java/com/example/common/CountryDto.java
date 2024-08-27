package com.example.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CountryDto {

    @NotNull(message = "Created date cannot be null")
    private LocalDateTime created;
    private LocalDateTime updated;

    @NotBlank(message = "Name cannot be blank")
    private String name;
    private String alpha2;
    private String alpha3;
    private String status;
}
