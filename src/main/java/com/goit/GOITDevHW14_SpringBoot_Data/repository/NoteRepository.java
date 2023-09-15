package com.goit.GOITDevHW14_SpringBoot_Data.repository;

import com.goit.GOITDevHW14_SpringBoot_Data.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}