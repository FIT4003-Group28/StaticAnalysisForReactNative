package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a6 f7411b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ h f7412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(h hVar, a6 a6Var) {
        this.f7412c = hVar;
        this.f7411b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7411b.w();
        if (pa.a()) {
            this.f7411b.a().a(this);
            return;
        }
        boolean b2 = this.f7412c.b();
        this.f7412c.f7338c = 0L;
        if (!b2) {
            return;
        }
        this.f7412c.a();
    }
}
