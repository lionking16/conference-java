package com.pluralsight.repository;

import com.pluralsight.mode.Speaker;

import java.util.List;

public class HibernateSpeakerRepoImpl implements SpeakerRepo {

    @Override
    public List<Speaker> findAll(){
        Speaker speaker = new Speaker();
        speaker.setFirstName("Pavan");
        speaker.setLastName("Singaraju");

        List<Speaker> speakers = List.of(speaker);

        return speakers;
    }
}
