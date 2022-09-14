package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements com.google.firebase.components.h {
    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.c.a a(com.google.firebase.components.e eVar) {
        return d.a((Context) eVar.a(Context.class));
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(com.google.firebase.crashlytics.c.a.class);
        a2.a(n.b(Context.class));
        a2.a(c.a(this));
        a2.c();
        return Arrays.asList(a2.b(), c.e.b.p.g.a("fire-cls-ndk", "17.1.0"));
    }
}
