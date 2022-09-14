package com.google.firebase.crashlytics.ndk;

import android.content.res.AssetManager;
/* loaded from: classes.dex */
class JniNativeApi implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9166a;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e2) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.b("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e2.getLocalizedMessage());
            z = false;
        }
        f9166a = z;
    }

    private native boolean nativeInit(String str, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.e
    public boolean a(String str, AssetManager assetManager) {
        return f9166a && nativeInit(str, assetManager);
    }
}
