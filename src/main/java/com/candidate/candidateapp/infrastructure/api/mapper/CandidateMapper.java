package com.candidate.candidateapp.infrastructure.api.mapper;

import com.candidate.candidateapp.infrastructure.api.dto.CandidateDto;
import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;

import java.util.ArrayList;
import java.util.List;

public class CandidateMapper {

    public Candidate dtoToModelCreate(CandidateDto candidateDto){
        return new Candidate(
                candidateDto.getName(),
                candidateDto.getEmail(),
                candidateDto.getGender(),
                candidateDto.getSalaryExpected()
        );
    }

    public Candidate dtoToModelUpdate(CandidateDto candidateDto){
        return new Candidate(
                candidateDto.getId(),
                candidateDto.getName(),
                candidateDto.getEmail(),
                candidateDto.getGender(),
                candidateDto.getSalaryExpected()
        );
    }
    public List<CandidateDto> modelToDto(List<Candidate> candidateList){
        List<CandidateDto> candidateDtoList = new ArrayList<>();
        candidateList.forEach(candidate -> {
            candidateDtoList.add(new CandidateDto(
                    candidate.getId(),
                    candidate.getName(),
                    candidate.getEmail(),
                    candidate.getGender(),
                    candidate.getSalaryExpected()
            ));
        });
        return candidateDtoList;
    }
}
