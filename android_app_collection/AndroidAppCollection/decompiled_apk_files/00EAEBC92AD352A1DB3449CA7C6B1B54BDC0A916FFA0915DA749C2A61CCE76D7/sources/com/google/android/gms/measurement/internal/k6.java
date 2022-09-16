package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class k6 {

    /* renamed from: a  reason: collision with root package name */
    final Context f7422a;

    /* renamed from: b  reason: collision with root package name */
    String f7423b;

    /* renamed from: c  reason: collision with root package name */
    String f7424c;

    /* renamed from: d  reason: collision with root package name */
    String f7425d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f7426e;

    /* renamed from: f  reason: collision with root package name */
    long f7427f;

    /* renamed from: g  reason: collision with root package name */
    c.e.a.b.d.g.f f7428g;

    /* renamed from: h  reason: collision with root package name */
    boolean f7429h;
    Long i;

    public k6(Context context, c.e.a.b.d.g.f fVar, Long l) {
        this.f7429h = true;
        com.google.android.gms.common.internal.s.a(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.s.a(applicationContext);
        this.f7422a = applicationContext;
        this.i = l;
        if (fVar != null) {
            this.f7428g = fVar;
            this.f7423b = fVar.f4141g;
            this.f7424c = fVar.f4140f;
            this.f7425d = fVar.f4139e;
            this.f7429h = fVar.f4138d;
            this.f7427f = fVar.f4137c;
            Bundle bundle = fVar.f4142h;
            if (bundle == null) {
                return;
            }
            this.f7426e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
        }
    }
}
