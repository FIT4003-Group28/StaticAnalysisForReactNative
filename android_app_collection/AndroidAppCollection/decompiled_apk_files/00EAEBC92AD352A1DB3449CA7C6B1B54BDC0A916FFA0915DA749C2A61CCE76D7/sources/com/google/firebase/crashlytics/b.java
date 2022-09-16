package com.google.firebase.crashlytics;

import com.google.firebase.components.e;
import com.google.firebase.components.g;
/* loaded from: classes.dex */
final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final CrashlyticsRegistrar f8581a;

    private b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f8581a = crashlyticsRegistrar;
    }

    public static g a(CrashlyticsRegistrar crashlyticsRegistrar) {
        return new b(crashlyticsRegistrar);
    }

    @Override // com.google.firebase.components.g
    public Object a(e eVar) {
        FirebaseCrashlytics a2;
        a2 = this.f8581a.a(eVar);
        return a2;
    }
}
