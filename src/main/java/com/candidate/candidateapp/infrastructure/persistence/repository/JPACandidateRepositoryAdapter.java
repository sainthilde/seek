package com.candidate.candidateapp.infrastructure.persistence.repository;

import com.candidate.candidateapp.domain.port.out.CandidateRepositoryPort;
import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JPACandidateRepositoryAdapter implements CandidateRepositoryPort{

    private final JPACandidateRepository jpaCandidateRepository;

    public JPACandidateRepositoryAdapter(JPACandidateRepository jpaCandidateRepository) {
        this.jpaCandidateRepository = jpaCandidateRepository;
    }

    @Override
    public List<Candidate> listCandidate() {
        return jpaCandidateRepository.findAll();
    }

    @Override
    public void registerCandidate(Candidate candidate) {
        jpaCandidateRepository.save(candidate);
    }

    @Override
    public void updateCandidate(Candidate candidate) {
        jpaCandidateRepository.save(candidate);
    }

    @Override
    public void deleteCandidate(Integer id) {
        jpaCandidateRepository.deleteById(id);
    }
}
