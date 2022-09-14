package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7219b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ y7 f7220c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8(y7 y7Var, fa faVar) {
        this.f7220c = y7Var;
        this.f7219b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7220c.f7806d;
        if (r3Var == null) {
            this.f7220c.c().s().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            r3Var.a(this.f7219b);
            this.f7220c.s().D();
            this.f7220c.a(r3Var, (com.google.android.gms.common.internal.x.a) null, this.f7219b);
            this.f7220c.K();
        } catch (RemoteException e2) {
            this.f7220c.c().s().a("Failed to send app launch to the service", e2);
        }
    }
}
