package com.facebook.react.bridge;

import c.d.l.a.a;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
@a
/* loaded from: classes.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.a(str);
        return makeDsoNative(SoLoader.c(str).getAbsolutePath(), str2);
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
