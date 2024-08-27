package com.example.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AddressDto {

    @NotNull(message = "Created date cannot be null")
    private LocalDateTime created;

    private LocalDateTime updated;

    @NotNull(message = "Country ID cannot be null")
    private Integer countryId;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @NotBlank(message = "ZIP code cannot be blank")
    @Size(min = 5, max = 10, message = "ZIP code must be between 5 and 10 characters")
    private String zipCode;

    @NotBlank(message = "City cannot be blank")
    private String city;

    @NotBlank(message = "State cannot be blank")
    private String state;

    private LocalDateTime archived;
}

