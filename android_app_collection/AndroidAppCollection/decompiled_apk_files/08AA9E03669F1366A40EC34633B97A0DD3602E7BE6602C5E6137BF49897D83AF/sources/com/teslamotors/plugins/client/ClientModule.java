package com.teslamotors.plugins.client;

import android.content.Intent;
import android.support.v4.app.ab;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ClientModule extends ReactContextBaseJavaModule {
    private static final String CALENDAR_PERMISSION_DENIED = "CALENDAR_PERMISSION_DENIED";
    private static final String CALENDAR_PERMISSION_GRANTED = "CALENDAR_PERMISSION_GRANTED";
    private static final String CALENDAR_PERMISSION_NOT_DETERMINED = "CALENDAR_PERMISSION_NOT_DETERMINED";
    private static final String CONTACTS_PERMISSION_AUTHORIZED = "CONTACTS_PERMISSION_AUTHORIZED";
    private static final String CONTACTS_PERMISSION_DENIED = "CONTACTS_PERMISSION_DENIED";
    private static final String CONTACTS_PERMISSION_NOT_DETERMINED = "CONTACTS_PERMISSION_NOT_DETERMINED";
    private static final String LOCATION_SERVICES_PERMISSION_AUTHORIZED_ALWAYS = "LOCATION_SERVICES_PERMISSION_AUTHORIZED_ALWAYS";
    private static final String LOCATION_SERVICES_PERMISSION_DENIED = "LOCATION_SERVICES_PERMISSION_DENIED";
    private static final String LOCATION_SERVICES_PERMISSION_NOT_DETERMINED = "LOCATION_SERVICES_PERMISSION_NOT_DETERMINED";
    private static final String REACT_CLASS = "TMClient";
    private static final String RESPONSE = "response";
    private static final String RESULT = "result";
    private static final String TAG = "ClientModule";

    @al
    public void forceUpdateWidgetExtension() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ClientModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void getCurrentCountryCode(af afVar) {
        afVar.a((Object) e.a(getReactApplicationContext()).b());
    }

    @al
    public void openNativePermissionSettings() {
        e.a(getReactApplicationContext()).a(getCurrentActivity());
    }

    @al
    public void openNativeLocationServicesSettings() {
        e.a(getReactApplicationContext()).b(getCurrentActivity());
    }

    @al
    public void checkCalendarPermissionStatus(af afVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", e.a(getReactApplicationContext()).c("android.permission.READ_CALENDAR") ? CALENDAR_PERMISSION_GRANTED : CALENDAR_PERMISSION_NOT_DETERMINED);
        afVar.a(writableNativeMap);
    }

    @al
    public void requestCalendarPermission(final af afVar) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        e.a(getReactApplicationContext()).a(getCurrentActivity(), "android.permission.READ_CALENDAR", new com.teslamotors.plugins.client.a.c() { // from class: com.teslamotors.plugins.client.ClientModule.1
            @Override // com.teslamotors.plugins.client.a.c
            public void a(int i, String str) {
                writableNativeMap.putString("result", ClientModule.CALENDAR_PERMISSION_GRANTED);
                afVar.a(writableNativeMap);
            }

            @Override // com.teslamotors.plugins.client.a.c
            public void b(int i, String str) {
                writableNativeMap.putString("result", ClientModule.CALENDAR_PERMISSION_DENIED);
                afVar.a(writableNativeMap);
            }
        });
    }

    @al
    public void checkLocationServicesPermission(af afVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", e.a(getReactApplicationContext()).c("android.permission.ACCESS_FINE_LOCATION") ? LOCATION_SERVICES_PERMISSION_AUTHORIZED_ALWAYS : LOCATION_SERVICES_PERMISSION_NOT_DETERMINED);
        afVar.a(writableNativeMap);
    }

    @al
    public void requestContactsPermission(final af afVar) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        e.a(getReactApplicationContext()).a(getCurrentActivity(), "android.permission.READ_CONTACTS", new com.teslamotors.plugins.client.a.c() { // from class: com.teslamotors.plugins.client.ClientModule.2
            @Override // com.teslamotors.plugins.client.a.c
            public void a(int i, String str) {
                writableNativeMap.putString("result", ClientModule.CONTACTS_PERMISSION_AUTHORIZED);
                afVar.a(writableNativeMap);
            }

            @Override // com.teslamotors.plugins.client.a.c
            public void b(int i, String str) {
                writableNativeMap.putString("result", ClientModule.CONTACTS_PERMISSION_DENIED);
                afVar.a(writableNativeMap);
            }
        });
    }

    @al
    public void checkContactsPermission(af afVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", e.a(getReactApplicationContext()).c("android.permission.READ_CONTACTS") ? CONTACTS_PERMISSION_AUTHORIZED : CONTACTS_PERMISSION_NOT_DETERMINED);
        afVar.a(writableNativeMap);
    }

    @al
    public void requestLocationServicesPermission(boolean z, final af afVar) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        e.a(getReactApplicationContext()).a(getCurrentActivity(), "android.permission.ACCESS_FINE_LOCATION", new com.teslamotors.plugins.client.a.c() { // from class: com.teslamotors.plugins.client.ClientModule.3
            @Override // com.teslamotors.plugins.client.a.c
            public void a(int i, String str) {
                writableNativeMap.putString("result", ClientModule.LOCATION_SERVICES_PERMISSION_AUTHORIZED_ALWAYS);
                afVar.a(writableNativeMap);
            }

            @Override // com.teslamotors.plugins.client.a.c
            public void b(int i, String str) {
                writableNativeMap.putString("result", ClientModule.LOCATION_SERVICES_PERMISSION_DENIED);
                afVar.a(writableNativeMap);
            }
        });
    }

    @al
    public void checkLocationServicesEnabled(af afVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("result", e.a(getReactApplicationContext()).w());
        afVar.a(writableNativeMap);
    }

    @al
    public void checkNotificationPermission(af afVar) {
        boolean a2 = ab.a(getReactApplicationContext()).a();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putBoolean("alert", a2);
        writableNativeMap2.putBoolean("badge", a2);
        writableNativeMap2.putBoolean("sound", a2);
        writableNativeMap.a("result", writableNativeMap2);
        afVar.a(writableNativeMap);
    }

    @al
    public void requestNotificationPermission(an anVar, af afVar) {
        Intent intent = new Intent();
        intent.setClassName(getReactApplicationContext(), "com.teslamotors.plugins.notifications.gcm.RegistrationIntentService");
        getReactApplicationContext().startService(intent);
        checkNotificationPermission(afVar);
    }

    @al
    public void syncSharedSelectedVehicleData(an anVar, af afVar) {
        an d2 = anVar.d("vehicle_data");
        if (d2 != null) {
            String string = d2.getString("vin");
            com.teslamotors.plugins.client.b.b.c(string, getReactApplicationContext());
            e.a(getReactApplicationContext()).b(string, d2.getString("display_name"));
        }
        JSONObject a2 = com.teslamotors.plugins.client.d.b.a(anVar);
        if (a2 == null) {
            return;
        }
        com.teslamotors.plugins.client.b.b.d(getReactApplicationContext(), a2.toString());
    }
}
