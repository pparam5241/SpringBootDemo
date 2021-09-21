package com.actonate.conferencedemo.repositories;

import com.actonate.conferencedemo.models.Session;
import com.actonate.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
