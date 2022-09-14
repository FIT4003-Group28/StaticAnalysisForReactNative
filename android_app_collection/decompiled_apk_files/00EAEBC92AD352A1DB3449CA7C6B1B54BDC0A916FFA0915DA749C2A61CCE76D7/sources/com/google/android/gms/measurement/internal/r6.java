package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
final class r6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7648b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7649c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r6(j6 j6Var, long j) {
        this.f7649c = j6Var;
        this.f7648b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j6 j6Var = this.f7649c;
        long j = this.f7648b;
        j6Var.g();
        j6Var.e();
        j6Var.x();
        j6Var.c().A().a("Resetting analytics data (FE)");
        c9 t = j6Var.t();
        t.g();
        t.f7223e.a();
        boolean g2 = j6Var.f7802a.g();
        m4 k = j6Var.k();
        k.j.a(j);
        if (!TextUtils.isEmpty(k.k().z.a())) {
            k.z.a(null);
        }
        if (c.e.a.b.d.g.qa.a() && k.l().a(r.w0)) {
            k.u.a(0L);
        }
        if (!k.l().p()) {
            k.c(!g2);
        }
        k.A.a(null);
        k.B.a(0L);
        k.C.a(null);
        j6Var.q().D();
        if (c.e.a.b.d.g.qa.a() && j6Var.l().a(r.w0)) {
            j6Var.t().f7222d.a();
        }
        j6Var.i = !g2;
        this.f7649c.q().a(new AtomicReference<>());
    }
}
