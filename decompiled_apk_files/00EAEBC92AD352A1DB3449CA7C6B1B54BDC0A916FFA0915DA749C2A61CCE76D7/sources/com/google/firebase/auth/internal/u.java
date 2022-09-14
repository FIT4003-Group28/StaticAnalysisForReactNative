package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import c.e.a.b.d.e.y2;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f8398a;

    /* renamed from: b  reason: collision with root package name */
    private final f f8399b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f8400c;

    private u(Context context, f fVar) {
        this.f8400c = false;
        this.f8398a = 0;
        this.f8399b = fVar;
        com.google.android.gms.common.api.internal.c.a((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.b().a(new t(this));
    }

    public u(c.e.b.d dVar) {
        this(dVar.b(), new f(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        return this.f8398a > 0 && !this.f8400c;
    }

    public final void a() {
        this.f8399b.c();
    }

    public final void a(y2 y2Var) {
        if (y2Var == null) {
            return;
        }
        long g2 = y2Var.g();
        if (g2 <= 0) {
            g2 = 3600;
        }
        f fVar = this.f8399b;
        fVar.f8350b = y2Var.r() + (g2 * 1000);
        fVar.f8351c = -1L;
        if (!b()) {
            return;
        }
        this.f8399b.a();
    }
}
