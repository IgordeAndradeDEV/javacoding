package com.igor.javacoding.services;

import com.igor.javacoding.dto.MillerDTO;
import com.igor.javacoding.dto.MillerResponseDTO;

public interface IMillerService {
    MillerResponseDTO timeOnEarthFromMiller(MillerDTO dto);
}
