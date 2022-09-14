package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: a  reason: collision with root package name */
    private g9 f7251a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c9 f7252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(c9 c9Var) {
        this.f7252b = c9Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Handler handler;
        this.f7252b.g();
        if (this.f7252b.l().a(r.p0) && this.f7251a != null) {
            handler = this.f7252b.f7221c;
            handler.removeCallbacks(this.f7251a);
        }
        if (this.f7252b.l().a(r.D0)) {
            this.f7252b.k().w.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        Handler handler;
        if (this.f7252b.l().a(r.p0)) {
            this.f7251a = new g9(this, this.f7252b.b().a(), j);
            handler = this.f7252b.f7221c;
            handler.postDelayed(this.f7251a, 2000L);
        }
    }
}
