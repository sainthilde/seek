package com.candidate.candidateapp.application.usecase;

import com.candidate.candidateapp.domain.port.in.RetrieveCandidateUseCase;
import com.candidate.candidateapp.domain.port.out.CandidateRepositoryPort;
import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;

import java.util.List;

public class RetriveCandidateUseCaseImpl implements RetrieveCandidateUseCase {
    private final CandidateRepositoryPort candidateRepositoryPort;

    public RetriveCandidateUseCaseImpl(CandidateRepositoryPort candidateRepositoryPort) {
        this.candidateRepositoryPort = candidateRepositoryPort;
    }


    @Override
    public List<Candidate> listCandidates() {
        return candidateRepositoryPort.listCandidate();
    }

    @Override
    public void registerCandidates(Candidate candidate) {
        candidateRepositoryPort.registerCandidate(candidate);
    }

    @Override
    public void updateCandidates(Candidate candidate) {
        candidateRepositoryPort.updateCandidate(candidate);
    }

    @Override
    public void deleteCandidates(Integer id) {
        candidateRepositoryPort.deleteCandidate(id);
    }
}
