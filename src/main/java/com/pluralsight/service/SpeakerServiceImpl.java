package com.pluralsight.service;

import com.pluralsight.mode.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepoImpl;
import com.pluralsight.repository.SpeakerRepo;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepo speakerRepo;

    @Override
    public List<Speaker> findAll(){
        return speakerRepo.findAll();
    }

    public void setSpeakerRepo(SpeakerRepo speakerRepo) {
        this.speakerRepo = speakerRepo;
    }
}
