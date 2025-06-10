package com.igor.javacoding.services.impl;

import com.igor.javacoding.dto.MillerDTO;
import com.igor.javacoding.dto.MillerResponseDTO;
import com.igor.javacoding.enums.MillerEnum;
import com.igor.javacoding.services.IMillerService;
import org.springframework.stereotype.Service;

@Service
public class MillerService implements IMillerService {

        @Override
        public MillerResponseDTO timeOnEarthFromMiller(MillerDTO dto) {
            int year, day;
            double hour, minute;
            MillerEnum type = MillerEnum.valueOf(dto.getType().trim().toUpperCase());

            switch (type) {
                case YEAR ->  {
                    year = dto.getTime() * 365 * 24 * 7;
                day = year * 365;
                hour = day * 24;
                minute = hour * 60;
                }

                case DAY -> {
                year = dto.getTime() * 24 * 7;
                day = year * 365;
                hour = day * 24;
                minute = hour * 60;
                }

                case HOUR -> {
                year = dto.getTime() * 7;
                day = year * 365;
                hour = day * 24;
                minute = hour * 60;
                }
                case MINUTE -> {
                year = 0;
                day = (dto.getTime() / 60) * 365;
                hour = day * 24;
                minute = hour * 60;

                }

                default -> {
                    throw new IllegalArgumentException("Tipo não permitido");
                }

            }

            return populateDTO(year, day, hour, minute);

        }

        private MillerResponseDTO populateDTO(int year, int day, double hour, double minute) {
            MillerResponseDTO dto = new MillerResponseDTO();
            dto.setYear(year);
            dto.setDay(day);
            dto.setHour(hour);
            dto.setMinute(minute);
            return dto;
        }
}
