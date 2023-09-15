package com.goit.GOITDevHW14_SpringBoot_Data.service;

import com.goit.GOITDevHW14_SpringBoot_Data.entity.Note;
import com.goit.GOITDevHW14_SpringBoot_Data.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.*;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    public Note add(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }

    public void update(Note note) {
        Long id = note.getId();
        if (!noteRepository.existsById(id)) {
            throw new IllegalArgumentException("Note " + id + " not found.");
        }
        noteRepository.save(note);
    }

    public Note getById(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Note " + id + " not found."));
    }
}
