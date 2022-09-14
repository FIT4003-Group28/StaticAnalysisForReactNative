package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class q5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p f7604b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fa f7605c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7606d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5(j5 j5Var, p pVar, fa faVar) {
        this.f7606d = j5Var;
        this.f7604b = pVar;
        this.f7605c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        p b2 = this.f7606d.b(this.f7604b, this.f7605c);
        r9Var = this.f7606d.f7390a;
        r9Var.q();
        r9Var2 = this.f7606d.f7390a;
        r9Var2.a(b2, this.f7605c);
    }
}
