package com.google.firebase.crashlytics;

import c.e.b.d;
import c.e.b.p.g;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements h {
    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics a(e eVar) {
        return FirebaseCrashlytics.a((d) eVar.a(d.class), (com.google.firebase.iid.z0.a) eVar.c(com.google.firebase.iid.z0.a.class).get(), (com.google.firebase.crashlytics.c.a) eVar.a(com.google.firebase.crashlytics.c.a.class), (com.google.firebase.analytics.a.a) eVar.a(com.google.firebase.analytics.a.a.class));
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(FirebaseCrashlytics.class);
        a2.a(n.b(c.e.b.d.class));
        a2.a(n.c(com.google.firebase.iid.z0.a.class));
        a2.a(n.a(com.google.firebase.analytics.a.a.class));
        a2.a(n.a(com.google.firebase.crashlytics.c.a.class));
        a2.a(b.a(this));
        a2.c();
        return Arrays.asList(a2.b(), g.a("fire-cls", "17.1.0"));
    }
}
