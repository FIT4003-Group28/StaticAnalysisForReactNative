package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.a.a;
/* loaded from: classes.dex */
class a implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private com.google.firebase.crashlytics.c.f.b f8579a;

    /* renamed from: b  reason: collision with root package name */
    private com.google.firebase.crashlytics.c.f.b f8580b;

    private static void a(com.google.firebase.crashlytics.c.f.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void a(String str, Bundle bundle) {
        a("clx".equals(bundle.getString("_o")) ? this.f8579a : this.f8580b, str, bundle);
    }

    @Override // com.google.firebase.analytics.a.a.b
    public void a(int i, Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Received Analytics message: " + i + " " + bundle);
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a(string, bundle2);
    }

    public void a(com.google.firebase.crashlytics.c.f.b bVar) {
        this.f8580b = bVar;
    }

    public void b(com.google.firebase.crashlytics.c.f.b bVar) {
        this.f8579a = bVar;
    }
}
