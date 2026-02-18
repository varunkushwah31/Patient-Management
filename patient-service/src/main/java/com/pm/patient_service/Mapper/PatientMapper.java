package com.pm.patient_service.Mapper;

import com.pm.patient_service.Dto.PatientResponseDTO;
import com.pm.patient_service.Model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        patientResponseDTO.setEmail(patient.getEmail());
        return patientResponseDTO;
    }
}
