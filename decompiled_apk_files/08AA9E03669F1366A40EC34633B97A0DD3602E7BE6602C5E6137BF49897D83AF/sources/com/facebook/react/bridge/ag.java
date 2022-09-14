package com.facebook.react.bridge;

import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
/* compiled from: PromiseImpl.java */
/* loaded from: classes.dex */
public class ag implements af {

    /* renamed from: a  reason: collision with root package name */
    private d f3219a;

    /* renamed from: b  reason: collision with root package name */
    private d f3220b;

    public ag(d dVar, d dVar2) {
        this.f3219a = dVar;
        this.f3220b = dVar2;
    }

    @Override // com.facebook.react.bridge.af
    public void a(Object obj) {
        if (this.f3219a != null) {
            this.f3219a.a(obj);
        }
    }

    @Override // com.facebook.react.bridge.af
    public void a(String str, String str2) {
        a(str, str2, null);
    }

    @Override // com.facebook.react.bridge.af
    @Deprecated
    public void a(String str) {
        a("EUNSPECIFIED", str, null);
    }

    @Override // com.facebook.react.bridge.af
    public void a(String str, Throwable th) {
        a(str, th.getMessage(), th);
    }

    @Override // com.facebook.react.bridge.af
    public void a(Throwable th) {
        a("EUNSPECIFIED", th.getMessage(), th);
    }

    @Override // com.facebook.react.bridge.af
    public void a(String str, String str2, Throwable th) {
        if (this.f3220b != null) {
            if (str == null) {
                str = "EUNSPECIFIED";
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("code", str);
            writableNativeMap.putString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, str2);
            this.f3220b.a(writableNativeMap);
        }
    }
}
