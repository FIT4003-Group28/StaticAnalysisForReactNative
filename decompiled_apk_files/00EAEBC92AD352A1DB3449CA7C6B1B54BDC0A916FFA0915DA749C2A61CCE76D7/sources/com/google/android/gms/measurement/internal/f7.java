package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class f7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7298b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f7(j6 j6Var, long j) {
        this.f7299c = j6Var;
        this.f7298b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7299c.k().p.a(this.f7298b);
        this.f7299c.c().A().a("Minimum session duration set", Long.valueOf(this.f7298b));
    }
}
