package com.deredhuzent.covidmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

//extend MainActivity to OnMapReadyCallback
class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    lateinit var myMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    //when the map is ready and the communication is done with google, then set myMap
    override fun onMapReady(gMap: GoogleMap?) {

        //when the map is ready, myMap becomes a google Map so I can use it
        myMap = gMap!!
    }
}
