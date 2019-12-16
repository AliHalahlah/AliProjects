package com.example.recycleview.repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.recycleview.model.NicePlace;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton pattern
 */
public class NicePlaceRepository {

    private static NicePlaceRepository instance;
    private ArrayList<NicePlace> dataSet = new ArrayList<>();

    public static NicePlaceRepository getInstance(){

        if(instance == null){
            instance = new NicePlaceRepository();
        }
        return instance;
    }

    //to get data from webservice
    public MutableLiveData<List<NicePlace>> getNicePlaces(){

        setNicePlaces();
        MutableLiveData<List<NicePlace>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;

    }

    private void setNicePlaces(){

        dataSet.add(new NicePlace("https://apod.nasa.gov/apod/image/1912/N63A_HubbleChandraSchmidt_960.jpg", "Trondheim1"));
        dataSet.add(new NicePlace("http://theopentutorials.com/totwp331/wp-content/uploads/totlogo.png", "Trondheim2"));
        dataSet.add(new NicePlace("https://cdn.arstechnica.net/wp-content/uploads/2018/06/macOS-Mojave-Dynamic-Wallpaper-transition.jpg", "Trondheim3"));
        dataSet.add(new NicePlace("https://robohash.org/123.png", "Trondheim4"));
        dataSet.add(new NicePlace("http://verona-api.municipiumstaging.it/system/images/image/image/22/app_1920_1280_4.jpg", "Trondheim5"));
        dataSet.add(new NicePlace("https://apod.nasa.gov/apod/image/1912/N63A_HubbleChandraSchmidt_960.jpg", "Trondheim6"));
        dataSet.add(new NicePlace("https://via.placeholder.com/500", "Trondheim7"));

    }
}
