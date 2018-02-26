package com.anton.fragmentsapp.architecture_components;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MessageViewModel extends ViewModel {

    private MutableLiveData<String> mFragmetnsData = new MutableLiveData<>();

    public void setFragmetnsData(String fragmetnsData) {
        mFragmetnsData.setValue(fragmetnsData);
    }

    public LiveData<String> getFragmetnsDataM() {
        return mFragmetnsData;
    }
}
