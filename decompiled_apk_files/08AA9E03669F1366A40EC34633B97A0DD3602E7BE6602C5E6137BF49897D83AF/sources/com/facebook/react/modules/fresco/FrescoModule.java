package com.facebook.react.modules.fresco;

import com.facebook.common.i.a;
import com.facebook.imagepipeline.f.h;
import com.facebook.l.g;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.network.e;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
/* loaded from: classes.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements x {
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private h mConfig;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FrescoModule";
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
    }

    public FrescoModule(ah ahVar) {
        this(ahVar, true, null);
    }

    public FrescoModule(ah ahVar, boolean z) {
        this(ahVar, z, null);
    }

    public FrescoModule(ah ahVar, boolean z, h hVar) {
        super(ahVar);
        this.mClearOnDestroy = z;
        this.mConfig = hVar;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().a(this);
        if (!hasBeenInitialized()) {
            com.facebook.common.i.a.a(new a());
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            com.facebook.f.a.a.c.a(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            com.facebook.common.e.a.c("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    public void clearSensitiveData() {
        com.facebook.f.a.a.c.c().c();
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    private static h getDefaultConfig(aj ajVar) {
        return getDefaultConfigBuilder(ajVar).a();
    }

    public static h.a getDefaultConfigBuilder(aj ajVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(new c());
        OkHttpClient a2 = e.a();
        ((com.facebook.react.modules.network.a) a2.cookieJar()).a(new JavaNetCookieJar(new com.facebook.react.modules.network.b(ajVar)));
        return com.facebook.imagepipeline.b.a.a.a(ajVar.getApplicationContext(), a2).a(new b(a2)).a(false).a(hashSet);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        if (!hasBeenInitialized() || !this.mClearOnDestroy) {
            return;
        }
        com.facebook.f.a.a.c.c().a();
    }

    /* loaded from: classes.dex */
    private static class a implements a.b {
        private a() {
        }

        @Override // com.facebook.common.i.a.b
        public void a(String str) {
            g.a(str);
        }
    }
}
