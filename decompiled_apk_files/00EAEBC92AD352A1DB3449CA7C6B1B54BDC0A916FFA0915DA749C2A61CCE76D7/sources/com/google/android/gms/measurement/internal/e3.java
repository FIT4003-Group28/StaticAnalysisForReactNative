package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class e3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7265b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a f7266c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e3(a aVar, long j) {
        this.f7266c = aVar;
        this.f7265b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7266c.b(this.f7265b);
    }
}
