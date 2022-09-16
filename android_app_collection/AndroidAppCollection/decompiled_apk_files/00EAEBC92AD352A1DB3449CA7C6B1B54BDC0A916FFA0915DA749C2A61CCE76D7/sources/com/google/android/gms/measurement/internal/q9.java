package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w9 f7625b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r9 f7626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q9(r9 r9Var, w9 w9Var) {
        this.f7626c = r9Var;
        this.f7625b = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7626c.a(this.f7625b);
        this.f7626c.e();
    }
}
