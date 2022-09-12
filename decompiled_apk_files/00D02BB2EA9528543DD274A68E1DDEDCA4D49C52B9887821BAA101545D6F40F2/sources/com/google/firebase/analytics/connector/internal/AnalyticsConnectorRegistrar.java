package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AnalyticsConnectorRegistrar implements depb {
    @Override // defpackage.depb
    public List<deow<?>> getComponents() {
        deov builder = deow.builder(delh.class);
        builder.b(depi.required(dela.class));
        builder.b(depi.required(Context.class));
        builder.b(depi.required(dera.class));
        builder.c(dell.a);
        builder.d(2);
        return Arrays.asList(builder.a(), devq.create("fire-analytics", "18.0.1"));
    }
}
