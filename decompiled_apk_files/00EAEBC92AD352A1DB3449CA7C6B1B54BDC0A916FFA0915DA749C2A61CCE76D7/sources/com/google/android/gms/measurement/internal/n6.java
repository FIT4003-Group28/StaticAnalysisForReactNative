package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class n6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7522b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7523c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n6(j6 j6Var, long j) {
        this.f7523c = j6Var;
        this.f7522b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7523c.k().q.a(this.f7522b);
        this.f7523c.c().A().a("Session timeout duration set", Long.valueOf(this.f7522b));
    }
}
