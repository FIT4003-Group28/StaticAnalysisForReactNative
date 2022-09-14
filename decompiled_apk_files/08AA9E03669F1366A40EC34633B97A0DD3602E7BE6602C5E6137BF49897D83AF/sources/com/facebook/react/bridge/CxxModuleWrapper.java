package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    private static native CxxModuleWrapper makeDsoNative(String str, String str2);

    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        com.facebook.l.g.a(str);
        return makeDsoNative(com.facebook.l.g.b(str).getAbsolutePath(), str2);
    }
}
