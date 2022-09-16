package com.teslamotors.plugins.crashlytics;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class CrashlyticsModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "TMCrashlytics";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public CrashlyticsModule(ah ahVar) {
        super(ahVar);
    }

    @al
    public void setSessionUsername(String str) {
        b.a(str);
    }

    @al
    public void logError(String str, Integer num, an anVar) {
        b.a(str, num, anVar != null ? recursivelyDeconstructReadableMap(anVar) : null);
    }

    private static Map<String, Object> recursivelyDeconstructReadableMap(an anVar) {
        HashMap hashMap = new HashMap();
        ReadableMapKeySetIterator a2 = anVar.a();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            switch (anVar.getType(nextKey)) {
                case Null:
                    hashMap.put(nextKey, null);
                    break;
                case Boolean:
                    hashMap.put(nextKey, Boolean.valueOf(anVar.getBoolean(nextKey)));
                    break;
                case Number:
                    hashMap.put(nextKey, Double.valueOf(anVar.getDouble(nextKey)));
                    break;
                case String:
                    hashMap.put(nextKey, anVar.getString(nextKey));
                    break;
                case Map:
                    hashMap.put(nextKey, recursivelyDeconstructReadableMap(anVar.d(nextKey)));
                    break;
                case Array:
                    hashMap.put(nextKey, recursivelyDeconstructReadableArray(anVar.e(nextKey)));
                    break;
            }
        }
        return hashMap;
    }

    private static List<Object> recursivelyDeconstructReadableArray(am amVar) {
        ArrayList arrayList = new ArrayList(amVar.size());
        for (int i = 0; i < amVar.size(); i++) {
            switch (amVar.getType(i)) {
                case Null:
                    arrayList.add(i, null);
                    break;
                case Boolean:
                    arrayList.add(i, Boolean.valueOf(amVar.getBoolean(i)));
                    break;
                case Number:
                    arrayList.add(i, Double.valueOf(amVar.getDouble(i)));
                    break;
                case String:
                    arrayList.add(i, amVar.getString(i));
                    break;
                case Map:
                    arrayList.add(i, recursivelyDeconstructReadableMap(amVar.c(i)));
                    break;
                case Array:
                    arrayList.add(i, recursivelyDeconstructReadableArray(amVar.d(i)));
                    break;
            }
        }
        return arrayList;
    }
}
