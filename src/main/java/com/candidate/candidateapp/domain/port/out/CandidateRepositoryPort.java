package com.candidate.candidateapp.domain.port.out;

import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;
import java.util.List;

public interface CandidateRepositoryPort {

    List<Candidate> listCandidate();

    void registerCandidate(Candidate candidate);

    void updateCandidate(Candidate candidate);

    void deleteCandidate(Integer id);
}
