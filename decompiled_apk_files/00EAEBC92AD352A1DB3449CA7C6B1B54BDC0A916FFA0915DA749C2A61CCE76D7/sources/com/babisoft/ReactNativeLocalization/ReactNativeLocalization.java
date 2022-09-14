package com.babisoft.ReactNativeLocalization;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactNativeLocalization extends ReactContextBaseJavaModule {
    private static final String LANGUAGE = "language";

    public ReactNativeLocalization(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String getCurrentLanguage() {
        String userLocale = getUserLocale();
        if (userLocale != null) {
            return userLocale;
        }
        Locale locale = getReactApplicationContext().getResources().getConfiguration().locale;
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    private SharedPreferences.Editor getEditor() {
        return getPreferences().edit();
    }

    private SharedPreferences getPreferences() {
        return getReactApplicationContext().getSharedPreferences("react-native", 0);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(LANGUAGE, getCurrentLanguage());
        return hashMap;
    }

    @ReactMethod
    public void getLanguage(Callback callback) {
        String currentLanguage = getCurrentLanguage();
        PrintStream printStream = System.out;
        printStream.println("The current language is " + currentLanguage);
        callback.invoke(null, currentLanguage);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactLocalization";
    }

    public String getUserLocale() {
        return getPreferences().getString("locale_override", null);
    }
}
