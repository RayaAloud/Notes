package com.example.note.notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NoteService {
    
    private List <Note> allNotes = new ArrayList<>(
        Arrays.asList(
            new Note("1", "7 Sep", "8:00" , "My note", "This is my note"),
            new Note("2", "27 Jan", "11:00" , "My Second note", "This is my second note")
        )
    );

    public List<Note> getNoteList () {
        return allNotes;
    }

    public Note getNote(String id) {
        return allNotes.stream().filter(note -> note.getId().equals(id)).findFirst().get();
    }

    public void addNote(Note note) {
        allNotes.add(note);
    }

    public void updateNote(Note note, String id)  {
        for (int i = 0; i < allNotes.size(); i++) {
            Note n = allNotes.get(i);
            if(n.getId().equals(id)) {
                allNotes.set(i, note);
            }
        }
    }

    public void deleteNote(String id) {
        allNotes.removeIf(note -> note.getId().equals(id));
    }

}
