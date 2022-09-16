package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class u8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r3 f7726b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p8 f7727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u8(p8 p8Var, r3 r3Var) {
        this.f7727c = p8Var;
        this.f7726b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7727c) {
            this.f7727c.f7592a = false;
            if (!this.f7727c.f7594c.B()) {
                this.f7727c.f7594c.c().A().a("Connected to remote service");
                this.f7727c.f7594c.a(this.f7726b);
            }
        }
    }
}
