package com.candidate.candidateapp.application.service;

import com.candidate.candidateapp.domain.port.in.RetrieveCandidateUseCase;
import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;

import java.util.List;

public class CandidateService implements RetrieveCandidateUseCase {

    private final RetrieveCandidateUseCase retrieveCandidateUseCase;

    public CandidateService(RetrieveCandidateUseCase retrieveCandidateUseCase) {
        this.retrieveCandidateUseCase = retrieveCandidateUseCase;
    }

    @Override
    public List<Candidate> listCandidates() {
        return retrieveCandidateUseCase.listCandidates();
    }

    @Override
    public void registerCandidates(Candidate candidate) {
        retrieveCandidateUseCase.registerCandidates(candidate);
    }

    @Override
    public void updateCandidates(Candidate candidate) {
        retrieveCandidateUseCase.updateCandidates(candidate);
    }

    @Override
    public void deleteCandidates(Integer id) {
        retrieveCandidateUseCase.deleteCandidates(id);
    }

}
