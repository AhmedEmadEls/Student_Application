package com.example.student_application.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.student_application.Dao.NotesDao;
import com.example.student_application.Database.NotesDatabase;
import com.example.student_application.Model1.Notes;

import java.util.List;

public class NotesRepository {

    public NotesDao notesDao;
    public LiveData<List<Notes>> getallNotes;


    public NotesRepository(Application application){
        NotesDatabase database = NotesDatabase.getDatabaseInstance(application);
        notesDao = database.notesDao();
        getallNotes = notesDao.getallNotes();
    }

    public void insertNotes(Notes notes){
        notesDao.insertNotes(notes);
    }

    public void deletNotes(int id ){
        notesDao.deleteNotes(id);
    }

    public void updateNotes(Notes notes){
        notesDao.updateNotes(notes);
    }



}
