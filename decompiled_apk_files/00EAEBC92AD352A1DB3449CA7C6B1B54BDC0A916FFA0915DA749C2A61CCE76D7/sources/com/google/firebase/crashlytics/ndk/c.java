package com.google.firebase.crashlytics.ndk;
/* loaded from: classes.dex */
final /* synthetic */ class c implements com.google.firebase.components.g {

    /* renamed from: a  reason: collision with root package name */
    private final CrashlyticsNdkRegistrar f9171a;

    private c(CrashlyticsNdkRegistrar crashlyticsNdkRegistrar) {
        this.f9171a = crashlyticsNdkRegistrar;
    }

    public static com.google.firebase.components.g a(CrashlyticsNdkRegistrar crashlyticsNdkRegistrar) {
        return new c(crashlyticsNdkRegistrar);
    }

    @Override // com.google.firebase.components.g
    public Object a(com.google.firebase.components.e eVar) {
        com.google.firebase.crashlytics.c.a a2;
        a2 = this.f9171a.a(eVar);
        return a2;
    }
}
