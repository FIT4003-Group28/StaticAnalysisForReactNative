package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements h {
    @Override // com.google.firebase.components.h
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(com.google.firebase.analytics.a.a.class);
        a2.a(n.b(c.e.b.d.class));
        a2.a(n.b(Context.class));
        a2.a(n.b(c.e.b.l.d.class));
        a2.a(c.f8278a);
        a2.c();
        return Arrays.asList(a2.b(), c.e.b.p.g.a("fire-analytics", "17.4.3"));
    }
}
