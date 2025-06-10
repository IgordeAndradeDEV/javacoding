package com.igor.javacoding.controllers;

import com.igor.javacoding.dto.MillerDTO;
import com.igor.javacoding.dto.MillerResponseDTO;
import com.igor.javacoding.services.IMillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class FirstAPI {

    @Autowired
    private IMillerService millerService;

    @GetMapping("/time")
    @ResponseBody
    public MillerResponseDTO getYearsOnEarthFromMiller(@RequestBody MillerDTO dto) {
        return millerService.timeOnEarthFromMiller(dto);
    }
}
