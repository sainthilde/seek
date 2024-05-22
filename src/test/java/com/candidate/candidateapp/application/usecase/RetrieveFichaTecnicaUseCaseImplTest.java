package com.candidate.candidateapp.application.usecase;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.candidate.candidateapp.domain.port.in.RetrieveCandidateUseCase;
import com.candidate.candidateapp.domain.port.out.CandidateRepositoryPort;
import com.candidate.candidateapp.infrastructure.persistence.entity.Candidate;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RetrieveFichaTecnicaUseCaseImplTest {

    @InjectMocks
    private RetriveCandidateUseCaseImpl retrieveCandidateUseCaseImpl;

    @Mock
    private CandidateRepositoryPort candidateRepositoryPort;

    @Mock
    private RetrieveCandidateUseCase retrieveCandidateUseCase;


    @Test
    void returnOnlyListWhenCallMethodListCandidate() {
        List<Candidate> fichaTecnicas = mock(ArrayList.class);

        when(candidateRepositoryPort.listCandidate()).thenReturn(fichaTecnicas);
        when(retrieveCandidateUseCase.listCandidates())
                .thenReturn(fichaTecnicas);
        when(retrieveCandidateUseCaseImpl
                .listCandidates())
                .thenReturn(fichaTecnicas);
        assertThat(retrieveCandidateUseCaseImpl
                .listCandidates()).isNotNull();
    }


}
