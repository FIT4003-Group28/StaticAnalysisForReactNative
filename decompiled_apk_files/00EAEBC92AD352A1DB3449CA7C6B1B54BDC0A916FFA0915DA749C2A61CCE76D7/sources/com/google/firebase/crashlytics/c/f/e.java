package com.google.firebase.crashlytics.c.f;

import android.os.Bundle;
/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f8605a;

    public e(com.google.firebase.analytics.a.a aVar) {
        this.f8605a = aVar;
    }

    @Override // com.google.firebase.crashlytics.c.f.a
    public void a(String str, Bundle bundle) {
        this.f8605a.a("clx", str, bundle);
    }
}
