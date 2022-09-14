package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q7 f7766b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f7767c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ p7 f7768d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w7(p7 p7Var, q7 q7Var, long j) {
        this.f7768d = p7Var;
        this.f7766b = q7Var;
        this.f7767c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7768d.a(this.f7766b, false, this.f7767c);
        p7 p7Var = this.f7768d;
        p7Var.f7588e = null;
        p7Var.q().a((q7) null);
    }
}
