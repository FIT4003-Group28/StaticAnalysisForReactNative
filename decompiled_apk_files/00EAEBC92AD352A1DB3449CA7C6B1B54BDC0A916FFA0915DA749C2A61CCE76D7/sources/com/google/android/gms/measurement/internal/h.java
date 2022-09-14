package com.google.android.gms.measurement.internal;

import android.os.Handler;
import c.e.a.b.d.g.id;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f7335d;

    /* renamed from: a  reason: collision with root package name */
    private final a6 f7336a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f7337b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f7338c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(a6 a6Var) {
        com.google.android.gms.common.internal.s.a(a6Var);
        this.f7336a = a6Var;
        this.f7337b = new k(this, a6Var);
    }

    private final Handler d() {
        Handler handler;
        if (f7335d != null) {
            return f7335d;
        }
        synchronized (h.class) {
            if (f7335d == null) {
                f7335d = new id(this.f7336a.d().getMainLooper());
            }
            handler = f7335d;
        }
        return handler;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.f7338c = this.f7336a.b().a();
            if (d().postDelayed(this.f7337b, j)) {
                return;
            }
            this.f7336a.c().s().a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean b() {
        return this.f7338c != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.f7338c = 0L;
        d().removeCallbacks(this.f7337b);
    }
}
