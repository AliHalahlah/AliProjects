package com.example.recycleview.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.recycleview.model.NicePlace;
import com.example.recycleview.repositories.NicePlaceRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<NicePlace>> mNicePlaces;
    private NicePlaceRepository mRepo;

    public void init(){

        if(mNicePlaces != null){
            return;
        }
        mRepo = NicePlaceRepository.getInstance();
        mNicePlaces = mRepo.getNicePlaces();

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("ViewModel", "ViewModel destroyed!");

    }

    public LiveData<List<NicePlace>> getNicePlaces(){


        return mNicePlaces;
    }
}
