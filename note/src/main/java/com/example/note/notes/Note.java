package com.example.note.notes;



public class Note {

    private String id;
    private String date;
    private String time;
    private String title;
    private String textNote;

       public Note() {

    }

    public Note(String id, String date, String time, String title, String textNote) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.title = title;
        this.textNote = textNote;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTextNote() {
        return textNote;
    }
    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }



}
