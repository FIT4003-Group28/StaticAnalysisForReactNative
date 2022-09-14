package com.facebook.react.modules.location;

import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.b;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
/* compiled from: PositionError.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f3592a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static int f3593b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static int f3594c = 3;

    public static ar a(int i, String str) {
        ar b2 = b.b();
        b2.putInt("code", i);
        if (str != null) {
            b2.putString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, str);
        }
        return b2;
    }
}
