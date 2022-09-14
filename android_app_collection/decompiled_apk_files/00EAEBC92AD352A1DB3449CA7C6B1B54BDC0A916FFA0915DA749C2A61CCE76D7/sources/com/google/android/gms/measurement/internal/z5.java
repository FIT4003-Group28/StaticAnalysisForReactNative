package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class z5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ oa f7832b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fa f7833c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7834d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z5(j5 j5Var, oa oaVar, fa faVar) {
        this.f7834d = j5Var;
        this.f7832b = oaVar;
        this.f7833c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9Var = this.f7834d.f7390a;
        r9Var.q();
        if (this.f7832b.f7564d.f() == null) {
            r9Var3 = this.f7834d.f7390a;
            r9Var3.b(this.f7832b, this.f7833c);
            return;
        }
        r9Var2 = this.f7834d.f7390a;
        r9Var2.a(this.f7832b, this.f7833c);
    }
}
