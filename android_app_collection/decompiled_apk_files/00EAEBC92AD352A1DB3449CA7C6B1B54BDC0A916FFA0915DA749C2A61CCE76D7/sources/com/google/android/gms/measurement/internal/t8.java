package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes.dex */
final class t8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p8 f7712b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t8(p8 p8Var) {
        this.f7712b = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7 y7Var = this.f7712b.f7594c;
        Context d2 = y7Var.d();
        this.f7712b.f7594c.w();
        y7Var.a(new ComponentName(d2, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
