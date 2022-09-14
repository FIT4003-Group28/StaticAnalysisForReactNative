package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7837b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ y9 f7838c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fa f7839d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y7 f7840e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z7(y7 y7Var, boolean z, y9 y9Var, fa faVar) {
        this.f7840e = y7Var;
        this.f7837b = z;
        this.f7838c = y9Var;
        this.f7839d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7840e.f7806d;
        if (r3Var == null) {
            this.f7840e.c().s().a("Discarding data. Failed to set user property");
            return;
        }
        this.f7840e.a(r3Var, this.f7837b ? null : this.f7838c, this.f7839d);
        this.f7840e.K();
    }
}
