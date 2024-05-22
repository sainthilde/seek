package com.candidate.candidateapp.infrastructure.persistence.repository;

import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPACandidateRepository extends JpaRepository<Candidate, Integer> {

}
