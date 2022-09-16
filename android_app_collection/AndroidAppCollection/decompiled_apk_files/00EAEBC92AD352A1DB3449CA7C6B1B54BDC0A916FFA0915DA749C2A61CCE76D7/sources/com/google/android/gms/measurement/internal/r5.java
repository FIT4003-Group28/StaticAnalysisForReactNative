package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class r5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7646b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j5 f7647c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r5(j5 j5Var, fa faVar) {
        this.f7647c = j5Var;
        this.f7646b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7647c.f7390a;
        r9Var.q();
        r9Var2 = this.f7647c.f7390a;
        r9Var2.a(this.f7646b);
    }
}
