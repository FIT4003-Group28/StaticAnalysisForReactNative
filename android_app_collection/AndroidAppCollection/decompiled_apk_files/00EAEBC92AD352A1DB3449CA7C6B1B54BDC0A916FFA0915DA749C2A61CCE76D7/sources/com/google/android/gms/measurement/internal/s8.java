package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class s8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r3 f7693b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p8 f7694c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s8(p8 p8Var, r3 r3Var) {
        this.f7694c = p8Var;
        this.f7693b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7694c) {
            this.f7694c.f7592a = false;
            if (!this.f7694c.f7594c.B()) {
                this.f7694c.f7594c.c().B().a("Connected to service");
                this.f7694c.f7594c.a(this.f7693b);
            }
        }
    }
}
