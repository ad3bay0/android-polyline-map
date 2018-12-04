package com.ad3bay0.firstmap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng abuleEgba = new LatLng(6.635812, 3.280841);
        LatLng abuleEgba2 = new LatLng(6.638999, 3.287447);
        LatLng abuleEgba3 = new LatLng(6.663565, 3.288447);



        Polyline polyline = googleMap.addPolyline(new PolylineOptions().add(abuleEgba,abuleEgba2,abuleEgba3,abuleEgba));


        mMap.addMarker(new MarkerOptions().position(abuleEgba).title("Abule Egba"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(abuleEgba,15));


    }
}
