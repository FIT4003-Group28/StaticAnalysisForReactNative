package com.i18n.reactnativei18n;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactNativeI18nLocale extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNI18n";
    }

    public ReactNativeI18nLocale(ah ahVar) {
        super(ahVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("locale", getReactApplicationContext().getResources().getConfiguration().locale.toString());
        return hashMap;
    }
}
