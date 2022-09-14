package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    long f7327b;

    /* renamed from: c  reason: collision with root package name */
    long f7328c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d9 f7329d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g9(d9 d9Var, long j, long j2) {
        this.f7329d = d9Var;
        this.f7327b = j;
        this.f7328c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7329d.f7252b.a().a(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.f9

            /* renamed from: b  reason: collision with root package name */
            private final g9 f7302b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7302b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g9 g9Var = this.f7302b;
                d9 d9Var = g9Var.f7329d;
                long j = g9Var.f7327b;
                long j2 = g9Var.f7328c;
                d9Var.f7252b.g();
                d9Var.f7252b.c().A().a("Application going to the background");
                boolean z = true;
                if (d9Var.f7252b.l().a(r.D0)) {
                    d9Var.f7252b.k().w.a(true);
                }
                Bundle bundle = new Bundle();
                if (!d9Var.f7252b.l().r().booleanValue()) {
                    d9Var.f7252b.f7223e.b(j2);
                    if (d9Var.f7252b.l().a(r.s0)) {
                        bundle.putLong("_et", d9Var.f7252b.a(j2));
                        p7.a(d9Var.f7252b.r().a(true), bundle, true);
                    } else {
                        z = false;
                    }
                    d9Var.f7252b.a(false, z, j2);
                }
                d9Var.f7252b.o().a("auto", "_ab", j, bundle);
            }
        });
    }
}
