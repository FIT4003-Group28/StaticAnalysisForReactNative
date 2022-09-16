package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7710b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p7 f7711c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t7(p7 p7Var, long j) {
        this.f7711c = p7Var;
        this.f7710b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7711c.n().a(this.f7710b);
        this.f7711c.f7588e = null;
    }
}
