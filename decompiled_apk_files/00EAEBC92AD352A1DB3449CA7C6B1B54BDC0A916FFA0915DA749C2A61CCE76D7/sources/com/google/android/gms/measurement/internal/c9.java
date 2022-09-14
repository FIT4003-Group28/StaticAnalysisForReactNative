package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import c.e.a.b.d.g.id;
/* loaded from: classes.dex */
public final class c9 extends f5 {

    /* renamed from: c  reason: collision with root package name */
    private Handler f7221c;

    /* renamed from: d  reason: collision with root package name */
    protected final l9 f7222d;

    /* renamed from: e  reason: collision with root package name */
    protected final j9 f7223e;

    /* renamed from: f  reason: collision with root package name */
    private final d9 f7224f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c9(d5 d5Var) {
        super(d5Var);
        this.f7222d = new l9(this);
        this.f7223e = new j9(this);
        this.f7224f = new d9(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        g();
        if (this.f7221c == null) {
            this.f7221c = new id(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        g();
        B();
        c().B().a("Activity resumed, time", Long.valueOf(j));
        if (l().a(r.D0)) {
            if (l().r().booleanValue() || k().w.a()) {
                this.f7223e.a(j);
            }
            this.f7224f.a();
        } else {
            this.f7224f.a();
            if (l().r().booleanValue()) {
                this.f7223e.a(j);
            }
        }
        l9 l9Var = this.f7222d;
        l9Var.f7469a.g();
        if (l9Var.f7469a.f7802a.g()) {
            if (!l9Var.f7469a.l().a(r.D0)) {
                l9Var.f7469a.k().w.a(false);
            }
            l9Var.a(l9Var.f7469a.b().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(long j) {
        g();
        B();
        c().B().a("Activity paused, time", Long.valueOf(j));
        this.f7224f.a(j);
        if (l().r().booleanValue()) {
            this.f7223e.b(j);
        }
        l9 l9Var = this.f7222d;
        if (!l9Var.f7469a.l().a(r.D0)) {
            l9Var.f7469a.k().w.a(true);
        }
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        return this.f7223e.c(j);
    }

    public final boolean a(boolean z, boolean z2, long j) {
        return this.f7223e.a(z, z2, j);
    }
}
