package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class x5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7781b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j5 f7782c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x5(j5 j5Var, fa faVar) {
        this.f7782c = j5Var;
        this.f7781b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7782c.f7390a;
        r9Var.q();
        r9Var2 = this.f7782c.f7390a;
        r9Var2.b(this.f7781b);
    }
}
