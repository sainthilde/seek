package com.candidate.candidateapp.application.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.candidate.candidateapp.domain.port.in.RetrieveCandidateUseCase;
import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class FichaTecnicaServiceTest {

    @Mock
    private RetrieveCandidateUseCase retrieveCandidateUseCase;

    @InjectMocks
    private CandidateService candidateService;

    @Test
    void returnListWhenCallMethodListCandidate() {
        List<Candidate> candidateList = mock(ArrayList.class);
        when(retrieveCandidateUseCase
                .listCandidates())
                .thenReturn(candidateList);
        assertThat(candidateService
                .listCandidates()).isNotNull();
    }
}
