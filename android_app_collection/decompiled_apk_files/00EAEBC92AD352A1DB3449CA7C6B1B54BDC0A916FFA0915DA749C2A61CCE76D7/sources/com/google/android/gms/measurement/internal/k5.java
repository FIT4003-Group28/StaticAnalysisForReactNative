package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class k5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ oa f7420b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j5 f7421c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k5(j5 j5Var, oa oaVar) {
        this.f7421c = j5Var;
        this.f7420b = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9Var = this.f7421c.f7390a;
        r9Var.q();
        if (this.f7420b.f7564d.f() == null) {
            r9Var3 = this.f7421c.f7390a;
            r9Var3.b(this.f7420b);
            return;
        }
        r9Var2 = this.f7421c.f7390a;
        r9Var2.a(this.f7420b);
    }
}
