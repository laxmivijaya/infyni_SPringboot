package com.infynicode.hospital.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include. NON_NULL)
public class ErrorResponse {
    private String errorMessage;
}
