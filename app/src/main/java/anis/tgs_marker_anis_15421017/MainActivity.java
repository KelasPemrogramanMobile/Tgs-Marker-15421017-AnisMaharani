package anis.tgs_marker_anis_15421017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView map =(MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        GeoPoint startPoint = new GeoPoint(-5.3797433,105.2512951);
        IMapController mapController = map.getController();
        mapController.setZoom(10);
        mapController.setCenter(startPoint);

        Marker startMarker =new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().getDrawable(R.drawable.ubl));
        startMarker.setTitle("UNIVERSITAS BANDAR LAMPUNG");





        GeoPoint startPoint1 = new GeoPoint(-5.3757702,105.2462424);
        IMapController mapController1 = map.getController();
        mapController1.setCenter(startPoint1);

        Marker startMarker1 =new Marker(map);
        startMarker1.setPosition(startPoint1);
        startMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker1);
        map.invalidate();
        startMarker1.setIcon(getResources().getDrawable(R.drawable.pascaubl));
        startMarker1.setTitle("PASCASARJANA UNIVERSITAS BANDAR LAMPUNG");








        GeoPoint startPoint2 = new GeoPoint(-5.3730137,105.240493);
        IMapController mapController2 = map.getController();
        mapController2.setCenter(startPoint2);

        Marker startMarker2 =new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.museum));
        startMarker2.setTitle("MUSEUM LAMPUNG");






        GeoPoint startPoint3 = new GeoPoint(-5.3811411,105.2525282);
        IMapController mapController3 = map.getController();
        mapController3.setCenter(startPoint3);

        Marker startMarker3 =new Marker(map);
        startMarker3.setPosition(startPoint3);
        startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker3);
        map.invalidate();
        startMarker3.setIcon(getResources().getDrawable(R.drawable.kosan));
        startMarker3.setTitle("KOSAN LARASATI");





        GeoPoint startPoint4 = new GeoPoint(-5.381785,105.259613);
        IMapController mapController4 = map.getController();
        mapController4.setCenter(startPoint4);

        Marker startMarker4 =new Marker(map);
        startMarker4.setPosition(startPoint4);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().getDrawable(R.drawable.mbk));
        startMarker4.setTitle("MALL BOEMI KEDATON");


        GeoPoint startPoint5 = new GeoPoint(-5.2394157,104.964736);
        IMapController mapController5 = map.getController();
        mapController5.setCenter(startPoint5);

        Marker startMarker5 =new Marker(map);
        startMarker5.setPosition(startPoint5);
        startMarker5.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker5);
        map.invalidate();
        startMarker5.setIcon(getResources().getDrawable(R.drawable.rumah));
        startMarker5.setTitle("GUBUK SYURGA");



    }

    }

