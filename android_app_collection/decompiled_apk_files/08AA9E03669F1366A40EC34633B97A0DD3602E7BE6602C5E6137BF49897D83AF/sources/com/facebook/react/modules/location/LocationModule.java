package com.facebook.react.modules.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.react.b.i;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.d;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import ezvcard.property.Kind;
/* loaded from: classes.dex */
public class LocationModule extends ReactContextBaseJavaModule {
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    private final LocationListener mLocationListener;
    private String mWatchedProvider;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LocationObserver";
    }

    public LocationModule(ah ahVar) {
        super(ahVar);
        this.mLocationListener = new LocationListener() { // from class: com.facebook.react.modules.location.LocationModule.1
            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) LocationModule.this.getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
                if (i == 0) {
                    LocationModule locationModule = LocationModule.this;
                    int i2 = com.facebook.react.modules.location.a.f3593b;
                    locationModule.emitError(i2, "Provider " + str + " is out of service.");
                } else if (i != 1) {
                } else {
                    LocationModule locationModule2 = LocationModule.this;
                    int i3 = com.facebook.react.modules.location.a.f3594c;
                    locationModule2.emitError(i3, "Provider " + str + " is temporarily unavailable.");
                }
            }
        };
    }

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f3582a;

        /* renamed from: b  reason: collision with root package name */
        private final double f3583b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3584c;

        /* renamed from: d  reason: collision with root package name */
        private final float f3585d;

        private a(long j, double d2, boolean z, float f) {
            this.f3582a = j;
            this.f3583b = d2;
            this.f3584c = z;
            this.f3585d = f;
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
            String validProvider = getValidProvider(locationManager, b2.f3584c);
            if (validProvider == null) {
                dVar2.a(com.facebook.react.modules.location.a.a(com.facebook.react.modules.location.a.f3593b, "No location provider available."));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || i.a() - lastKnownLocation.getTime() >= b2.f3583b) {
                new b(locationManager, validProvider, b2.f3582a, dVar, dVar2).a(lastKnownLocation);
            } else {
                dVar.a(locationToMap(lastKnownLocation));
            }
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    @al
    public void startObserving(an anVar) {
        if ("gps".equals(this.mWatchedProvider)) {
            return;
        }
        a b2 = a.b(anVar);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION);
            String validProvider = getValidProvider(locationManager, b2.f3584c);
            if (validProvider == null) {
                emitError(com.facebook.react.modules.location.a.f3593b, "No location provider available.");
                return;
            }
            if (!validProvider.equals(this.mWatchedProvider)) {
                locationManager.removeUpdates(this.mLocationListener);
                locationManager.requestLocationUpdates(validProvider, 1000L, b2.f3585d, this.mLocationListener);
            }
            this.mWatchedProvider = validProvider;
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    @al
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION)).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
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
        if (Build.VERSION.SDK_INT >= 18) {
            b2.putBoolean("mocked", location.isFromMockProvider());
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitError(int i, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", com.facebook.react.modules.location.a.a(i, str));
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d f3586a;

        /* renamed from: b  reason: collision with root package name */
        private final d f3587b;

        /* renamed from: c  reason: collision with root package name */
        private final LocationManager f3588c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3589d;
        private final long e;
        private Location f;
        private final Handler g;
        private final Runnable h;
        private final LocationListener i;
        private boolean j;

        private b(LocationManager locationManager, String str, long j, d dVar, d dVar2) {
            this.g = new Handler();
            this.h = new Runnable() { // from class: com.facebook.react.modules.location.LocationModule.b.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (b.this) {
                        if (!b.this.j) {
                            b.this.f3587b.a(com.facebook.react.modules.location.a.a(com.facebook.react.modules.location.a.f3594c, "Location request timed out"));
                            b.this.f3588c.removeUpdates(b.this.i);
                            com.facebook.common.e.a.b("ReactNative", "LocationModule: Location request timed out");
                            b.this.j = true;
                        }
                    }
                }
            };
            this.i = new LocationListener() { // from class: com.facebook.react.modules.location.LocationModule.b.2
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
                        if (!b.this.j && b.this.a(location, b.this.f)) {
                            b.this.f3586a.a(LocationModule.locationToMap(location));
                            b.this.g.removeCallbacks(b.this.h);
                            b.this.j = true;
                            b.this.f3588c.removeUpdates(b.this.i);
                        }
                        b.this.f = location;
                    }
                }
            };
            this.f3588c = locationManager;
            this.f3589d = str;
            this.e = j;
            this.f3586a = dVar;
            this.f3587b = dVar2;
        }

        public void a(Location location) {
            this.f = location;
            this.f3588c.requestLocationUpdates(this.f3589d, 100L, 1.0f, this.i);
            this.g.postDelayed(this.h, this.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z = time > 120000;
            boolean z2 = time < -120000;
            boolean z3 = time > 0;
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = accuracy > 200;
            boolean a2 = a(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            return z3 && !z6 && a2;
        }

        private boolean a(String str, String str2) {
            if (str == null) {
                return str2 == null;
            }
            return str.equals(str2);
        }
    }
}
