package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class b9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f7197b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c9 f7198c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b9(c9 c9Var, long j) {
        this.f7198c = c9Var;
        this.f7197b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7198c.b(this.f7197b);
    }
}
