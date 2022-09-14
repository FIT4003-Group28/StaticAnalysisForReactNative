package com.facebook.react.modules.systeminfo;

import android.os.Build;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class AndroidInfoModule extends BaseJavaModule {
    private static final String IS_TESTING = "IS_TESTING";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlatformConstants";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("ServerHost", a.a());
        hashMap.put("isTesting", Boolean.valueOf("true".equals(System.getProperty(IS_TESTING))));
        hashMap.put("reactNativeVersion", b.f3688a);
        return hashMap;
    }
}
