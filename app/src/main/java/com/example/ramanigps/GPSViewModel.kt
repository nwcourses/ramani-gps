package com.example.ramanigps

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.maplibre.android.geometry.LatLng

class GPSViewModel : ViewModel(){
    var latLng = LatLng(51.05, -0.72)
        set(newValue) {
            field = newValue
            latLngLiveData.value = newValue
        }

    var latLngLiveData = MutableLiveData<LatLng>()
}