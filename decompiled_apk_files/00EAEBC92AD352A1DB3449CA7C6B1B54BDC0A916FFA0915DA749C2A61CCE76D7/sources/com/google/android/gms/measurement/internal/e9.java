package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class e9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7278b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c9 f7279c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e9(c9 c9Var, long j) {
        this.f7279c = c9Var;
        this.f7278b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7279c.c(this.f7278b);
    }
}
