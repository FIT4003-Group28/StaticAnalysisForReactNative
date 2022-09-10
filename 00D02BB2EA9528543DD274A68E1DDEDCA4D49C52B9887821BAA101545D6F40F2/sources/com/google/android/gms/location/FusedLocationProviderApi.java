package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.LocationRequestInternal;
/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public interface FusedLocationProviderApi {
    public static final String EXTRA_KEY_ELEVATION_WGS84_M = "elevation";
    public static final String EXTRA_KEY_LEVEL_ID = "levelId";
    public static final String EXTRA_KEY_LEVEL_NUMBER_E3 = "levelNumberE3";
    public static final String EXTRA_KEY_LOCATION_TYPE = "locationType";
    public static final String EXTRA_KEY_WIFI_SCAN = "wifiScan";
    public static final int EXTRA_VALUE_LOCATION_TYPE_CELL = 2;
    public static final int EXTRA_VALUE_LOCATION_TYPE_GPS = 1;
    public static final int EXTRA_VALUE_LOCATION_TYPE_UNKNOWN = 0;
    public static final int EXTRA_VALUE_LOCATION_TYPE_WIFI = 3;
    public static final int INJECTION_TYPE_GPS_EXTERNAL = 1;
    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    cnoh<Status> flushLocations(GoogleApiClient googleApiClient);

    Location getLastLocation(GoogleApiClient googleApiClient);

    LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient);

    cnoh<Status> injectLocation(GoogleApiClient googleApiClient, Location location, int i);

    cnoh<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    cnoh<Status> removeLocationUpdates(GoogleApiClient googleApiClient, cola colaVar);

    cnoh<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, cola colaVar, Looper looper);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, cola colaVar, Looper looper);

    cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, LocationListener locationListener, Looper looper);

    cnoh<Status> setMockLocation(GoogleApiClient googleApiClient, Location location);

    cnoh<Status> setMockMode(GoogleApiClient googleApiClient, boolean z);
}
