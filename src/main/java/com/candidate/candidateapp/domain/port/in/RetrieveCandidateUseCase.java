package com.candidate.candidateapp.domain.port.in;

import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;

import java.util.List;

public interface RetrieveCandidateUseCase {

    List<Candidate> listCandidates();
    void registerCandidates(Candidate candidate);
    void updateCandidates(Candidate candidate);
    void deleteCandidates(Integer id);
}
