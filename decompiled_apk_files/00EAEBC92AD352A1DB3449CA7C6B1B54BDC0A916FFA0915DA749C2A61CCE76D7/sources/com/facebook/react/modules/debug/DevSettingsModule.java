package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.h.c;
@com.facebook.react.d0.a.a(name = DevSettingsModule.NAME)
/* loaded from: classes.dex */
public class DevSettingsModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DevSettings";
    private final c mDevSupportManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSettingsModule.this.mDevSupportManager.d();
        }
    }

    /* loaded from: classes.dex */
    class b implements com.facebook.react.devsupport.h.b {
        b(DevSettingsModule devSettingsModule, String str) {
        }
    }

    public DevSettingsModule(ReactApplicationContext reactApplicationContext, c cVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = cVar;
    }

    @ReactMethod
    public void addMenuItem(String str) {
        this.mDevSupportManager.a(str, new b(this, str));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void onFastRefresh() {
    }

    @ReactMethod
    public void reload() {
        if (this.mDevSupportManager.a()) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    @ReactMethod
    public void reloadWithReason(String str) {
        reload();
    }

    @ReactMethod
    public void setHotLoadingEnabled(boolean z) {
        this.mDevSupportManager.c(z);
    }

    @ReactMethod
    public void setIsDebuggingRemotely(boolean z) {
        this.mDevSupportManager.b(z);
    }

    @ReactMethod
    public void setProfilingEnabled(boolean z) {
        this.mDevSupportManager.a(z);
    }

    @ReactMethod
    public void toggleElementInspector() {
        this.mDevSupportManager.e();
    }
}
