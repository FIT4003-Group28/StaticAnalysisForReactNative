package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* loaded from: classes.dex */
public class LocationServices {
    public static final Api<cnnv> API;
    private static final cnnp<conr, cnnv> CLIENT_BUILDER;
    private static final cnoa<conr> CLIENT_KEY;
    private static final String CLIENT_NAME = "locationServices";
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi;
    @Deprecated
    public static final coki GeofencingApi;
    @Deprecated
    public static final colo SettingsApi;

    static {
        cnoa<conr> cnoaVar = new cnoa<>();
        CLIENT_KEY = cnoaVar;
        cold coldVar = new cold();
        CLIENT_BUILDER = coldVar;
        API = new Api<>("LocationServices.API", coldVar, cnoaVar);
        FusedLocationApi = new comr();
        GeofencingApi = new comw();
        SettingsApi = new conw();
    }

    private LocationServices() {
    }

    public static conr getConnectedClientImpl(GoogleApiClient googleApiClient) {
        boolean z = true;
        cnwc.e(googleApiClient != null, "GoogleApiClient parameter is required.");
        conr conrVar = (conr) googleApiClient.getClient(CLIENT_KEY);
        if (conrVar == null) {
            z = false;
        }
        cnwc.c(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return conrVar;
    }

    public static cokf getFusedLocationProviderClient(Activity activity) {
        return new cokf(activity);
    }

    public static cokm getGeofencingClient(Activity activity) {
        return new cokm(activity);
    }

    public static colr getSettingsClient(Activity activity) {
        return new colr(activity);
    }

    public static cokf getFusedLocationProviderClient(Context context) {
        return new cokf(context);
    }

    public static cokm getGeofencingClient(Context context) {
        return new cokm(context);
    }

    public static colr getSettingsClient(Context context) {
        return new colr(context);
    }
}
