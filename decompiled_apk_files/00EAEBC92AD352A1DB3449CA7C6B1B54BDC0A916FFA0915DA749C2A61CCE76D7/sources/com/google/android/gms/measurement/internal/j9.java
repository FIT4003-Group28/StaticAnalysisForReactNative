package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import c.e.a.b.d.g.va;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a  reason: collision with root package name */
    private long f7405a;

    /* renamed from: b  reason: collision with root package name */
    private long f7406b;

    /* renamed from: c  reason: collision with root package name */
    private final h f7407c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ c9 f7408d;

    public j9(c9 c9Var) {
        this.f7408d = c9Var;
        this.f7407c = new i9(this, this.f7408d.f7802a);
        this.f7405a = c9Var.b().b();
        this.f7406b = this.f7405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f7408d.g();
        a(false, false, this.f7408d.b().b());
        this.f7408d.n().a(this.f7408d.b().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f7407c.c();
        this.f7405a = 0L;
        this.f7406b = this.f7405a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        this.f7408d.g();
        this.f7407c.c();
        this.f7405a = j;
        this.f7406b = this.f7405a;
    }

    public final boolean a(boolean z, boolean z2, long j) {
        this.f7408d.g();
        this.f7408d.x();
        if (!c.e.a.b.d.g.ia.a() || !this.f7408d.l().a(r.A0)) {
            j = this.f7408d.b().b();
        }
        if (!c.e.a.b.d.g.qa.a() || !this.f7408d.l().a(r.w0) || this.f7408d.f7802a.g()) {
            this.f7408d.k().u.a(this.f7408d.b().a());
        }
        long j2 = j - this.f7405a;
        if (!z && j2 < 1000) {
            this.f7408d.c().B().a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (this.f7408d.l().a(r.U) && !z2) {
            j2 = (!va.a() || !this.f7408d.l().a(r.W) || !c.e.a.b.d.g.ia.a() || !this.f7408d.l().a(r.A0)) ? b() : c(j);
        }
        this.f7408d.c().B().a("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        p7.a(this.f7408d.r().a(!this.f7408d.l().r().booleanValue()), bundle, true);
        if (this.f7408d.l().a(r.U) && !this.f7408d.l().a(r.V) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f7408d.l().a(r.V) || !z2) {
            this.f7408d.o().a("auto", "_e", bundle);
        }
        this.f7405a = j;
        this.f7407c.c();
        this.f7407c.a(3600000L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        long b2 = this.f7408d.b().b();
        long j = b2 - this.f7406b;
        this.f7406b = b2;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j) {
        this.f7407c.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long c(long j) {
        long j2 = j - this.f7406b;
        this.f7406b = j;
        return j2;
    }
}
