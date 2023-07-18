package com.example.note.notes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;


    @RequestMapping("/notes")
    public List<Note> allNotes() {
        return noteService.getNoteList();
    }

    @RequestMapping("/notes/{id}")
    public Note getNote(@PathVariable String id) {
        return noteService.getNote(id);
    }
    
    @RequestMapping(method= RequestMethod.POST, value = "/notes")
    public void addNote(@RequestBody Note note) {
        noteService.addNote(note);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/notes/{id}")
    public void updateNote(@RequestBody Note note, @PathVariable String id) {
        noteService.updateNote(note, id);
    }

    @RequestMapping (method = RequestMethod.DELETE, value = "/notes/{id}")
    public void deleteNote(@PathVariable String id) {
        noteService.deleteNote(id);
    }
}
