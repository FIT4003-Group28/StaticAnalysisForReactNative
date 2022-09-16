package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.internal.LocationRequestInternal;
/* compiled from: PG */
/* renamed from: comr  reason: default package */
/* loaded from: classes.dex */
public final class comr implements FusedLocationProviderApi {
    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new comf(googleApiClient));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:8:0x0026, B:10:0x0032, B:11:0x0044), top: B:15:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:8:0x0026, B:10:0x0032, B:11:0x0044), top: B:15:0x0026 }] */
    @Override // com.google.android.gms.location.FusedLocationProviderApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient r7) {
        /*
            r6 = this;
            conr r0 = com.google.android.gms.location.LocationServices.getConnectedClientImpl(r7)
            android.content.Context r7 = r7.getContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 30
            if (r1 < r3) goto L25
            if (r7 == 0) goto L25
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.String r3 = "getAttributionTag"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L25
            java.lang.Object r7 = r1.invoke(r7, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L25
            goto L26
        L25:
            r7 = r2
        L26:
            com.google.android.gms.common.Feature[] r1 = r0.u()     // Catch: java.lang.Exception -> L56
            com.google.android.gms.common.Feature r3 = defpackage.cojn.c     // Catch: java.lang.Exception -> L56
            boolean r1 = defpackage.cnxi.a(r1, r3)     // Catch: java.lang.Exception -> L56
            if (r1 == 0) goto L44
            conn r0 = r0.t     // Catch: java.lang.Exception -> L56
            colx r1 = r0.f     // Catch: java.lang.Exception -> L56
            r1.a()     // Catch: java.lang.Exception -> L56
            colx r0 = r0.f     // Catch: java.lang.Exception -> L56
            cond r0 = r0.b()     // Catch: java.lang.Exception -> L56
            android.location.Location r7 = r0.j(r7)     // Catch: java.lang.Exception -> L56
            goto L55
        L44:
            conn r7 = r0.t     // Catch: java.lang.Exception -> L56
            colx r0 = r7.f     // Catch: java.lang.Exception -> L56
            r0.a()     // Catch: java.lang.Exception -> L56
            colx r7 = r7.f     // Catch: java.lang.Exception -> L56
            cond r7 = r7.b()     // Catch: java.lang.Exception -> L56
            android.location.Location r7 = r7.i()     // Catch: java.lang.Exception -> L56
        L55:
            return r7
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.comr.getLastLocation(com.google.android.gms.common.api.GoogleApiClient):android.location.Location");
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        try {
            return LocationServices.getConnectedClientImpl(googleApiClient).T();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> injectLocation(GoogleApiClient googleApiClient, Location location, int i) {
        return googleApiClient.execute(new comc(googleApiClient, location, i));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new como(googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new coml(googleApiClient, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new come(googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new comd(googleApiClient, z));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> removeLocationUpdates(GoogleApiClient googleApiClient, cola colaVar) {
        return googleApiClient.execute(new comb(googleApiClient, colaVar));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, cola colaVar, Looper looper) {
        return googleApiClient.execute(new comk(googleApiClient, locationRequest, colaVar, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.execute(new comn(googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        cnwc.n(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.execute(new comg(googleApiClient, locationRequest, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        return googleApiClient.execute(new comh(googleApiClient, locationRequest, locationListener, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        return googleApiClient.execute(new comm(googleApiClient, locationRequestInternal, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, cola colaVar, Looper looper) {
        return googleApiClient.execute(new comj(googleApiClient, locationRequestInternal, colaVar, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final cnoh<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequestInternal locationRequestInternal, LocationListener locationListener, Looper looper) {
        return googleApiClient.execute(new comi(googleApiClient, locationRequestInternal, locationListener, looper));
    }
}
