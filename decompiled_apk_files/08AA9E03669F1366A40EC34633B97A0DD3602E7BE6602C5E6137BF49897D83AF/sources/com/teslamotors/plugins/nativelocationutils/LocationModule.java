package com.teslamotors.plugins.nativelocationutils;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.b.i;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.d;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.iid.InstanceID;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class LocationModule extends ReactContextBaseJavaModule {
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    private static final String TAG = "LocationModule";
    private static List<String> sProviders = Arrays.asList("gps", "network", "passive");
    private final LocationListener mLocationListener;
    private List<String> mWatchedProviders;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TMLocationObserver";
    }

    public LocationModule(ah ahVar) {
        super(ahVar);
        this.mWatchedProviders = new ArrayList();
        this.mLocationListener = new LocationListener() { // from class: com.teslamotors.plugins.nativelocationutils.LocationModule.1
            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                if (LocationModule.this.getReactApplicationContext().b()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) LocationModule.this.getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
                }
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
                if (i == 0) {
                    LocationModule locationModule = LocationModule.this;
                    locationModule.emitError("Provider " + str + " is out of service.");
                } else if (i != 1) {
                } else {
                    LocationModule locationModule2 = LocationModule.this;
                    locationModule2.emitError("Provider " + str + " is temporarily unavailable.");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f5380a;

        /* renamed from: b  reason: collision with root package name */
        private final double f5381b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f5382c;

        /* renamed from: d  reason: collision with root package name */
        private final float f5383d;

        private a(long j, double d2, boolean z, float f) {
            this.f5380a = j;
            this.f5381b = d2;
            this.f5382c = z;
            this.f5383d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(an anVar) {
            return new a(anVar.hasKey("timeout") ? (long) anVar.getDouble("timeout") : Long.MAX_VALUE, anVar.hasKey("maximumAge") ? anVar.getDouble("maximumAge") : Double.POSITIVE_INFINITY, anVar.hasKey("enableHighAccuracy") && anVar.getBoolean("enableHighAccuracy"), anVar.hasKey("distanceFilter") ? (float) anVar.getDouble("distanceFilter") : LocationModule.RCT_DEFAULT_LOCATION_ACCURACY);
        }
    }

    @al
    public void getCurrentPosition(an anVar, d dVar, d dVar2) {
        a b2 = a.b(anVar);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION);
            String validProvider = getValidProvider(locationManager, b2.f5382c);
            if (validProvider == null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("code", 1);
                writableNativeMap.putString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, "No available location provider.");
                writableNativeMap.putInt("PERMISSION_DENIED", 1);
                writableNativeMap.putInt("POSITION_UNAVAILABLE", 0);
                writableNativeMap.putInt(InstanceID.ERROR_TIMEOUT, 0);
                dVar2.a(writableNativeMap);
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || i.a() - lastKnownLocation.getTime() >= b2.f5381b) {
                new b(locationManager, validProvider, b2.f5380a, dVar, dVar2).a();
            } else {
                dVar.a(locationToMap(lastKnownLocation));
            }
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    @al
    public void startObserving(an anVar) {
        if (this.mWatchedProviders.size() > 0) {
            return;
        }
        try {
            setupListeners((LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION), a.b(anVar));
            if (this.mWatchedProviders.size() != 0) {
                return;
            }
            emitError("No location providers are available.");
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    private void setupListeners(LocationManager locationManager, a aVar) {
        for (String str : sProviders) {
            if (!this.mWatchedProviders.contains(str)) {
                try {
                    locationManager.requestLocationUpdates(str, 1000L, aVar.f5383d, this.mLocationListener);
                    this.mWatchedProviders.add(str);
                } catch (Exception unused) {
                    Log.e(TAG, String.format("Failed to add location provider: %s", str));
                }
            }
        }
    }

    @al
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION)).removeUpdates(this.mLocationListener);
        this.mWatchedProviders.clear();
    }

    private static String getValidProvider(LocationManager locationManager, boolean z) {
        String str = z ? "gps" : "network";
        if (!locationManager.isProviderEnabled(str)) {
            str = str.equals("gps") ? "network" : "gps";
            if (!locationManager.isProviderEnabled(str)) {
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ar locationToMap(Location location) {
        ar b2 = com.facebook.react.bridge.b.b();
        ar b3 = com.facebook.react.bridge.b.b();
        b3.putDouble("latitude", location.getLatitude());
        b3.putDouble("longitude", location.getLongitude());
        b3.putDouble("altitude", location.getAltitude());
        b3.putDouble("accuracy", location.getAccuracy());
        b3.putDouble("heading", location.getBearing());
        b3.putDouble("speed", location.getSpeed());
        b2.a("coords", b3);
        b2.putDouble("timestamp", location.getTime());
        b2.putBoolean("mocked", location.isFromMockProvider());
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitError(String str) {
        if (getReactApplicationContext().b()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", str);
        }
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d f5384a;

        /* renamed from: b  reason: collision with root package name */
        private final d f5385b;

        /* renamed from: c  reason: collision with root package name */
        private final LocationManager f5386c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5387d;
        private final long e;
        private final Handler f;
        private final Runnable g;
        private final LocationListener h;
        private boolean i;

        private b(LocationManager locationManager, String str, long j, d dVar, d dVar2) {
            this.f = new Handler();
            this.g = new Runnable() { // from class: com.teslamotors.plugins.nativelocationutils.LocationModule.b.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (b.this) {
                        if (!b.this.i) {
                            b.this.f5385b.a("Location request timed out");
                            b.this.f5386c.removeUpdates(b.this.h);
                            b.this.i = true;
                        }
                    }
                }
            };
            this.h = new LocationListener() { // from class: com.teslamotors.plugins.nativelocationutils.LocationModule.b.2
                @Override // android.location.LocationListener
                public void onProviderDisabled(String str2) {
                }

                @Override // android.location.LocationListener
                public void onProviderEnabled(String str2) {
                }

                @Override // android.location.LocationListener
                public void onStatusChanged(String str2, int i, Bundle bundle) {
                }

                @Override // android.location.LocationListener
                public void onLocationChanged(Location location) {
                    synchronized (b.this) {
                        if (!b.this.i) {
                            b.this.f5384a.a(LocationModule.locationToMap(location));
                            b.this.f.removeCallbacks(b.this.g);
                            b.this.i = true;
                        }
                    }
                }
            };
            this.f5386c = locationManager;
            this.f5387d = str;
            this.e = j;
            this.f5384a = dVar;
            this.f5385b = dVar2;
        }

        public void a() {
            this.f5386c.requestSingleUpdate(this.f5387d, this.h, (Looper) null);
            this.f.postDelayed(this.g, this.e);
        }
    }
}
