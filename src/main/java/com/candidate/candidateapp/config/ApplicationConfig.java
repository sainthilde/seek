package com.candidate.candidateapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.candidate.candidateapp.application.service.CandidateService;
import com.candidate.candidateapp.application.usecase.RetriveCandidateUseCaseImpl;
import com.candidate.candidateapp.domain.port.out.CandidateRepositoryPort;
import com.candidate.candidateapp.infrastructure.persistence.repository.JPACandidateRepositoryAdapter;


@Configuration
public class ApplicationConfig {

    @Bean
    public CandidateService candidateService(
            CandidateRepositoryPort candidateRepositoryPort
    ){
        return new CandidateService(new RetriveCandidateUseCaseImpl(
                candidateRepositoryPort
        ));
    }

    @Bean
    public CandidateRepositoryPort candidateRepositoryPort(
            JPACandidateRepositoryAdapter jpaCandidateRepositoryAdapter ) {
        return jpaCandidateRepositoryAdapter;
    }

}
