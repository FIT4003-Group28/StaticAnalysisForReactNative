package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import c.e.a.b.d.e.u3;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    private static com.google.android.gms.common.l.a f8348h = new com.google.android.gms.common.l.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    private final c.e.b.d f8349a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f8350b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f8351c;

    /* renamed from: d  reason: collision with root package name */
    private long f8352d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f8353e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f8354f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f8355g;

    public f(c.e.b.d dVar) {
        f8348h.c("Initializing TokenRefresher", new Object[0]);
        com.google.android.gms.common.internal.s.a(dVar);
        this.f8349a = dVar;
        this.f8353e = new HandlerThread("TokenRefresher", 10);
        this.f8353e.start();
        this.f8354f = new u3(this.f8353e.getLooper());
        this.f8355g = new e(this, this.f8349a.c());
        this.f8352d = 300000L;
    }

    public final void a() {
        com.google.android.gms.common.l.a aVar = f8348h;
        long j = this.f8350b - this.f8352d;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        aVar.c(sb.toString(), new Object[0]);
        c();
        this.f8351c = Math.max((this.f8350b - com.google.android.gms.common.util.h.d().a()) - this.f8352d, 0L) / 1000;
        this.f8354f.postDelayed(this.f8355g, this.f8351c * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int i = (int) this.f8351c;
        this.f8351c = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * this.f8351c : i != 960 ? 30L : 960L;
        this.f8350b = com.google.android.gms.common.util.h.d().a() + (this.f8351c * 1000);
        com.google.android.gms.common.l.a aVar = f8348h;
        long j = this.f8350b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        aVar.c(sb.toString(), new Object[0]);
        this.f8354f.postDelayed(this.f8355g, this.f8351c * 1000);
    }

    public final void c() {
        this.f8354f.removeCallbacks(this.f8355g);
    }
}
