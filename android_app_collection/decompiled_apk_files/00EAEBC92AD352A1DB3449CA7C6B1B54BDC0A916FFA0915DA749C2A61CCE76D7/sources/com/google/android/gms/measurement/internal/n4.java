package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class n4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7516b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ k4 f7517c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(k4 k4Var, boolean z) {
        this.f7517c = k4Var;
        this.f7516b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9Var = this.f7517c.f7417a;
        r9Var.a(this.f7516b);
    }
}
