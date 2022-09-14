package com.teslamotors.plugins.devicestorage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.b;
import com.teslamotors.plugins.client.d.d;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class SharedPreferenceModule extends ReactContextBaseJavaModule {
    private static final String DEVICE_STORAGE_COMMIT_ERROR_UNABLE_TO_COMMIT = "DEVICE_STORAGE_COMMIT_ERROR_UNABLE_TO_COMMIT";
    private static final String DEVICE_STORAGE_COMMIT_NO_ERROR = "DEVICE_STORAGE_COMMIT_NO_ERROR";
    private static final String IDENTIFIER = "identifier";
    private static final String LEGACY_STORAGE_ERROR_NO_VALUE = "LEGACY_STORAGE_ERROR_NO_VALUE";
    private static final String LEGACY_STORAGE_ERROR_UNABLE_TO_DELETE = "LEGACY_STORAGE_ERROR_UNABLE_TO_DELETE";
    private static final String LEGACY_STORAGE_NO_ERROR = "LEGACY_STORAGE_NO_ERROR";
    private static final String NON_SECURE_STORAGE_ERROR_NO_VALUE = "NON_SECURE_STORAGE_ERROR_NO_VALUE";
    private static final String NON_SECURE_STORAGE_ERROR_UNABLE_TO_CREATE = "NON_SECURE_STORAGE_ERROR_UNABLE_TO_CREATE";
    private static final String NON_SECURE_STORAGE_ERROR_UNABLE_TO_DELETE = "NON_SECURE_STORAGE_ERROR_UNABLE_TO_DELETE";
    private static final String NON_SECURE_STORAGE_NOT_COMMITTED = "NON_SECURE_STORAGE_NOT_COMMITTED";
    private static final String NON_SECURE_STORAGE_NO_ERROR = "NON_SECURE_STORAGE_NO_ERROR";
    private static final String REACT_CLASS = "TMDeviceStorageAccess";
    private static final String RESULT = "result";
    private static final String SECURE_STORAGE_ERROR_NO_VALUE = "SECURE_STORAGE_ERROR_NO_VALUE";
    private static final String SECURE_STORAGE_ERROR_UNABLE_TO_CREATE = "SECURE_STORAGE_ERROR_UNABLE_TO_CREATE";
    private static final String SECURE_STORAGE_ERROR_UNABLE_TO_DELETE = "SECURE_STORAGE_ERROR_UNABLE_TO_DELETE";
    private static final String SECURE_STORAGE_NOT_COMMITTED = "SECURE_STORAGE_NOT_COMMITTED";
    private static final String SECURE_STORAGE_NO_ERROR = "SECURE_STORAGE_NO_ERROR";
    private static final String TAG = "SharedPreferenceModule";
    private static final String VALUE = "value";
    private final SharedPreferences mNonSecurePrefs;
    private final SharedPreferences mSecurePrefs;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public SharedPreferenceModule(ah ahVar) {
        super(ahVar);
        this.mSecurePrefs = d.d(ahVar);
        this.mNonSecurePrefs = d.e(ahVar);
    }

    @al
    public void storeSecureValues(an anVar, boolean z, af afVar) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        aq a2 = b.a();
        Bundle a3 = b.a(anVar);
        if (a3 != null) {
            Iterator<String> it = a3.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                d.a().a(next, a3.getString(next), false, this.mSecurePrefs);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(IDENTIFIER, next);
                if (!z) {
                    writableNativeMap.putString("result", SECURE_STORAGE_NOT_COMMITTED);
                    a2.a(writableNativeMap);
                } else {
                    arrayList.add(writableNativeMap);
                }
            }
            if (z) {
                boolean b2 = d.a().b();
                for (i = 0; i < arrayList.size(); i++) {
                    ar arVar = (ar) arrayList.get(i);
                    if (b2) {
                        str = SECURE_STORAGE_NO_ERROR;
                    } else {
                        str = this.mNonSecurePrefs.contains(arVar.getString(IDENTIFIER)) ? SECURE_STORAGE_ERROR_UNABLE_TO_DELETE : SECURE_STORAGE_ERROR_UNABLE_TO_CREATE;
                    }
                    arVar.putString("result", str);
                    a2.a(arVar);
                }
            }
        }
        afVar.a(a2);
    }

    @al
    public void storeSecureBiometricRestrictedValues(an anVar, boolean z, af afVar) {
        storeSecureValues(anVar, z, afVar);
    }

    @al
    public void retrieveSecureValues(am amVar, an anVar, af afVar) {
        aq a2 = b.a();
        for (int i = 0; i < amVar.size(); i++) {
            String b2 = d.a().b(amVar.getString(i), this.mSecurePrefs);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (b2 != null) {
                writableNativeMap.putString(IDENTIFIER, amVar.getString(i));
                writableNativeMap.putString(VALUE, b2);
                writableNativeMap.putString("result", SECURE_STORAGE_NO_ERROR);
            } else {
                writableNativeMap.putString(IDENTIFIER, amVar.getString(i));
                writableNativeMap.putString("result", SECURE_STORAGE_ERROR_NO_VALUE);
            }
            a2.a(writableNativeMap);
        }
        afVar.a(a2);
    }

    @al
    public void deleteSecureValues(am amVar, boolean z, af afVar) {
        ArrayList arrayList = new ArrayList();
        aq a2 = b.a();
        for (int i = 0; i < amVar.size(); i++) {
            d.a().a(amVar.getString(i), false, this.mSecurePrefs);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(IDENTIFIER, amVar.getString(i));
            if (!z) {
                writableNativeMap.putString("result", SECURE_STORAGE_NOT_COMMITTED);
                a2.a(writableNativeMap);
            } else {
                arrayList.add(writableNativeMap);
            }
        }
        if (z) {
            boolean b2 = d.a().b();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ar arVar = (ar) arrayList.get(i2);
                arVar.putString("result", b2 ? SECURE_STORAGE_NO_ERROR : SECURE_STORAGE_ERROR_UNABLE_TO_DELETE);
                a2.a(arVar);
            }
        }
        afVar.a(a2);
    }

    @al
    public void storeNonSecureValues(an anVar, boolean z, af afVar) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        aq a2 = b.a();
        Bundle a3 = b.a(anVar);
        Iterator<String> it = a3.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            d.a().a(next, a3.getString(next), false, this.mNonSecurePrefs);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(IDENTIFIER, next);
            if (!z) {
                writableNativeMap.putString("result", NON_SECURE_STORAGE_NOT_COMMITTED);
                a2.a(writableNativeMap);
            } else {
                arrayList.add(writableNativeMap);
            }
        }
        if (z) {
            boolean b2 = d.a().b();
            for (i = 0; i < arrayList.size(); i++) {
                ar arVar = (ar) arrayList.get(i);
                if (b2) {
                    str = NON_SECURE_STORAGE_NO_ERROR;
                } else {
                    str = this.mNonSecurePrefs.contains(arVar.getString(IDENTIFIER)) ? NON_SECURE_STORAGE_ERROR_UNABLE_TO_DELETE : NON_SECURE_STORAGE_ERROR_UNABLE_TO_CREATE;
                }
                arVar.putString("result", str);
                a2.a(arVar);
            }
        }
        afVar.a(a2);
    }

    @al
    public void retrieveNonSecureValues(am amVar, af afVar) {
        aq a2 = b.a();
        for (int i = 0; i < amVar.size(); i++) {
            String b2 = d.a().b(amVar.getString(i), this.mNonSecurePrefs);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (b2 != null) {
                writableNativeMap.putString(IDENTIFIER, amVar.getString(i));
                writableNativeMap.putString(VALUE, b2);
                writableNativeMap.putString("result", NON_SECURE_STORAGE_NO_ERROR);
            } else {
                writableNativeMap.putString(IDENTIFIER, amVar.getString(i));
                writableNativeMap.putString("result", NON_SECURE_STORAGE_ERROR_NO_VALUE);
            }
            a2.a(writableNativeMap);
        }
        afVar.a(a2);
    }

    @al
    public void deleteNonSecureValues(am amVar, boolean z, af afVar) {
        ArrayList arrayList = new ArrayList();
        aq a2 = b.a();
        for (int i = 0; i < amVar.size(); i++) {
            d.a().a(amVar.getString(i), false, this.mNonSecurePrefs);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(IDENTIFIER, amVar.getString(i));
            if (!z) {
                writableNativeMap.putString("result", NON_SECURE_STORAGE_NOT_COMMITTED);
                a2.a(writableNativeMap);
            } else {
                arrayList.add(writableNativeMap);
            }
        }
        if (z) {
            boolean b2 = d.a().b();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ar arVar = (ar) arrayList.get(i2);
                arVar.putString("result", b2 ? NON_SECURE_STORAGE_NO_ERROR : NON_SECURE_STORAGE_ERROR_UNABLE_TO_DELETE);
                a2.a(arVar);
            }
        }
        afVar.a(a2);
    }

    @al
    public void commitDeviceStorageChanges(af afVar) {
        boolean b2 = d.a().b();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", b2 ? DEVICE_STORAGE_COMMIT_NO_ERROR : DEVICE_STORAGE_COMMIT_ERROR_UNABLE_TO_COMMIT);
        afVar.a(writableNativeMap);
    }

    @al
    public void retrieveLegacyValues(am amVar, af afVar) {
        aq a2 = b.a();
        SharedPreferences a3 = d.a(getReactApplicationContext());
        SharedPreferences b2 = d.b(getReactApplicationContext());
        SharedPreferences c2 = d.c(getReactApplicationContext());
        for (int i = 0; i < amVar.size(); i++) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            Bundle a4 = b.a(amVar.c(i));
            if (a4 != null) {
                String string = a4.getString(IDENTIFIER);
                String string2 = a4.getString(Kind.LOCATION);
                writableNativeMap.putString(IDENTIFIER, string);
                if (string2 != null && (string2.equals("TeslaClient") || string2.equals("LoginPrefs") || string2.equals("CalendarPrefs"))) {
                    SharedPreferences sharedPreferences = null;
                    if (string2.equals("TeslaClient")) {
                        sharedPreferences = a3;
                    } else if (string2.equals("LoginPrefs")) {
                        sharedPreferences = b2;
                    } else if (string2.equals("CalendarPrefs")) {
                        sharedPreferences = c2;
                    }
                    if (sharedPreferences != null) {
                        String b3 = d.a().b(string, sharedPreferences);
                        if (b3 != null) {
                            writableNativeMap.putString(IDENTIFIER, string);
                            writableNativeMap.putString(VALUE, b3);
                            writableNativeMap.putString("result", LEGACY_STORAGE_NO_ERROR);
                        } else {
                            writableNativeMap.putString(IDENTIFIER, string);
                            writableNativeMap.putString("result", LEGACY_STORAGE_ERROR_NO_VALUE);
                        }
                    }
                } else {
                    writableNativeMap.putString("result", LEGACY_STORAGE_ERROR_NO_VALUE);
                }
                a2.a(writableNativeMap);
            }
        }
        afVar.a(a2);
    }

    @al
    public void clearLegacyStorage(am amVar, af afVar) {
        d.a().a(d.a(getReactApplicationContext()), false);
        d.a().a(d.b(getReactApplicationContext()), false);
        d.a().a(d.c(getReactApplicationContext()), false);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", d.a().b() ? LEGACY_STORAGE_NO_ERROR : LEGACY_STORAGE_ERROR_UNABLE_TO_DELETE);
        afVar.a(writableNativeMap);
    }
}
