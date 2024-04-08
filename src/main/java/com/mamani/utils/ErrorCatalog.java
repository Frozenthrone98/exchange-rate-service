package com.mamani.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
  INVALID_REQUEST("ERR_INVALID_001", "Invalid request parameters."),
  GENERIC_ERROR("ERR_GEN_001", "An unexpected error occurred.");

  private final String code;
  private final String message;

  ErrorCatalog(String code, String message) {
    this.code = code;
    this.message = message;
  }

}
