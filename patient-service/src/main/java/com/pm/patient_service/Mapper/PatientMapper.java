package com.pm.patient_service.Mapper;

import com.pm.patient_service.Dto.PatientRequestDTO;
import com.pm.patient_service.Dto.PatientResponseDTO;
import com.pm.patient_service.Model.Patient;
import org.jspecify.annotations.NonNull;

import java.time.LocalDate;

public class PatientMapper {

    public static @NonNull PatientResponseDTO toDTO(@NonNull Patient patient){
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        patientResponseDTO.setEmail(patient.getEmail());
        return patientResponseDTO;
    }

    public static @NonNull Patient toPatient(@NonNull PatientRequestDTO requestDTO){
        Patient patient = new Patient();
        patient.setAddress(requestDTO.getAddress());
        patient.setName(requestDTO.getName());
        patient.setEmail(requestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(requestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(requestDTO.getRegisteredDate()));
        return patient;
    }
}
