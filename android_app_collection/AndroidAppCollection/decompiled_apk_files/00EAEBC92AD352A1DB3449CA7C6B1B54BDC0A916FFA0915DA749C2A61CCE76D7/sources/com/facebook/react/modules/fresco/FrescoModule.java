package com.facebook.react.modules.fresco;

import c.d.j.f.i;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.g;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
@com.facebook.react.d0.a.a(name = FrescoModule.NAME, needsEagerInit = true)
/* loaded from: classes.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements com.facebook.react.e0.a.a, LifecycleEventListener {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private i mConfig;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, i iVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = iVar;
    }

    private static i getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).a();
    }

    public static i.b getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new c());
        OkHttpClient a2 = g.a();
        ((com.facebook.react.modules.network.a) a2.cookieJar()).a(new JavaNetCookieJar(new com.facebook.react.modules.network.c(reactContext)));
        i.b a3 = c.d.j.b.a.a.a(reactContext.getApplicationContext(), a2);
        a3.a(new b(a2));
        a3.a(false);
        a3.a(hashSet);
        return a3;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        c.d.h.a.a.c.a().a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            c.d.h.a.a.c.a(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            c.d.d.e.a.d("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (!hasBeenInitialized() || !this.mClearOnDestroy) {
            return;
        }
        c.d.h.a.a.c.a().c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
