package com.example.usx28452.torontobuffaloborderwaiting;

import android.app.ProgressDialog;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class Border extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    static final LatLng lQue = new LatLng(43.153321,-79.04451);
    static final LatLng rBow=new LatLng(43.090077,-79.067834);
    static final LatLng pB=new LatLng(42.906934,-78.905936);
    static final LatLng lo=new LatLng(43.046562, -79.007889);

    private Button aButton;
    private Button bButton;
    private Button cButton;
    Location location=null;
    Marker myMarker;
    ProgressDialog nDialog;
    String[][] wTime=new String [6][4];
    ProgressDialog pDialog;
    List<String> WTIME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_border);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //aButton=(Button)this.findViewById(R.id.button1);
        //bButton=(Button)this.findViewById(R.id.button2);
        //cButton=(Button)this.findViewById(R.id.button3);
        // Enabling MyLocation Layer of Google Map
        // mMap.setMyLocationEnabled(false);
        // Getting LocationManager object from System Service LOCATION_SERVICE
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lo));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10));

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
