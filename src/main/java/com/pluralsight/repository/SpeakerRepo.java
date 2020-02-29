package com.pluralsight.repository;

import com.pluralsight.mode.Speaker;

import java.util.List;

public interface SpeakerRepo {
    List<Speaker> findAll();
}
