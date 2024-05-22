package com.candidate.candidateapp.infrastructure.api.controller;

import com.candidate.candidateapp.application.service.CandidateService;
import com.candidate.candidateapp.infrastructure.api.dto.CandidateDto;
import com.candidate.candidateapp.infrastructure.api.mapper.CandidateMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin()
public class CandidateController  {
    private final CandidateService candidateService;
    private CandidateMapper mapper = new CandidateMapper();
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/candidates")
    public ResponseEntity<Object> listCandidates() {
        return ResponseEntity.ok(mapper.modelToDto(candidateService.listCandidates()));
    }

    @PostMapping("/candidates/candidate")
    public ResponseEntity<Void> registerCandidates(@RequestBody CandidateDto candidateDto){
        candidateService.registerCandidates(mapper.dtoToModelCreate(candidateDto));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/candidates/candidate")
    public ResponseEntity<Void>  updateCandidates(@RequestBody CandidateDto candidateDto){
        candidateService.updateCandidates(mapper.dtoToModelUpdate(candidateDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/candidates/candidate/{id}")
    public ResponseEntity<Void>  deleteCandidates(@PathVariable String id){
        candidateService.deleteCandidates(Integer.parseInt(id));
        return ResponseEntity.noContent().build();
    }

}
