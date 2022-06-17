package com.example.student_application.ViewModel;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.student_application.Model1.Notes;
import com.example.student_application.Repository.NotesRepository;

import java.util.List;

public class NotesViewModel extends AndroidViewModel {


    public NotesRepository repository;
    public LiveData<List<Notes>> getAllNotes;


    public NotesViewModel(Application application) {
        super(application);

        repository = new NotesRepository(application);
        getAllNotes = repository.getallNotes;

    }



    void insertNotes(Notes notes){
        repository.insertNotes(notes);
    }

    void delettNotes(int id){
        repository.deletNotes(id);
    }

    void updateNotes(Notes notes){
        repository.updateNotes(notes);
    }

}
