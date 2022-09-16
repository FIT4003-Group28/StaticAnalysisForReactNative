package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class l5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7455b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j5 f7456c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l5(j5 j5Var, fa faVar) {
        this.f7456c = j5Var;
        this.f7455b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7456c.f7390a;
        r9Var.q();
        r9Var2 = this.f7456c.f7390a;
        fa faVar = this.f7455b;
        r9Var2.a().g();
        r9Var2.o();
        com.google.android.gms.common.internal.s.b(faVar.f7303b);
        r9Var2.c(faVar);
    }
}
