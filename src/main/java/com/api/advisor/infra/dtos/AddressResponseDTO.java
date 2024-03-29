package com.api.advisor.infra.dtos;

public record AddressResponseDTO(
  String id,
  String city,
  String state,
  String street,
  String neighborhood,
  String number,
  String zipcode
) {}
