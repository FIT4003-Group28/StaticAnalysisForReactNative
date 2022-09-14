package com.facebook.react.bridge;

import android.content.Context;
/* compiled from: JSBundleLoader.java */
/* loaded from: classes.dex */
public abstract class o {
    public abstract String a(CatalystInstanceImpl catalystInstanceImpl);

    public static o a(final Context context, final String str, final boolean z) {
        return new o() { // from class: com.facebook.react.bridge.o.1
            @Override // com.facebook.react.bridge.o
            public String a(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static o a(String str) {
        return a(str, str, false);
    }

    public static o a(final String str, final String str2, final boolean z) {
        return new o() { // from class: com.facebook.react.bridge.o.2
            @Override // com.facebook.react.bridge.o
            public String a(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromFile(str, str2, z);
                return str;
            }
        };
    }

    public static o a(final String str, final String str2) {
        return new o() { // from class: com.facebook.react.bridge.o.3
            @Override // com.facebook.react.bridge.o
            public String a(CatalystInstanceImpl catalystInstanceImpl) {
                try {
                    catalystInstanceImpl.loadScriptFromFile(str2, str, false);
                    return str;
                } catch (Exception e) {
                    throw com.facebook.react.b.b.a(e.getMessage(), e);
                }
            }
        };
    }
}
