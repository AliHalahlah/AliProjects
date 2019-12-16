package com.example.recycleview.util;

import com.example.recycleview.viewmodels.MainViewModelFactory;

public class InjectorUtils {


  public static MainViewModelFactory provideMainViewModelFactory(){

    return new MainViewModelFactory();
  }

}
