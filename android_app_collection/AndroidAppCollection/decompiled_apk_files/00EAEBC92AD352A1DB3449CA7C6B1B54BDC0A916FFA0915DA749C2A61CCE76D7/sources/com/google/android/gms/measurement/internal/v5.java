package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class v5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ y9 f7737b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fa f7738c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7739d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v5(j5 j5Var, y9 y9Var, fa faVar) {
        this.f7739d = j5Var;
        this.f7737b = y9Var;
        this.f7738c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9Var = this.f7739d.f7390a;
        r9Var.q();
        if (this.f7737b.f() == null) {
            r9Var3 = this.f7739d.f7390a;
            r9Var3.b(this.f7737b, this.f7738c);
            return;
        }
        r9Var2 = this.f7739d.f7390a;
        r9Var2.a(this.f7737b, this.f7738c);
    }
}
