package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7195b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ y7 f7196c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b8(y7 y7Var, fa faVar) {
        this.f7196c = y7Var;
        this.f7195b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7196c.f7806d;
        if (r3Var == null) {
            this.f7196c.c().s().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            r3Var.d(this.f7195b);
        } catch (RemoteException e2) {
            this.f7196c.c().s().a("Failed to reset data on the service: remote exception", e2);
        }
        this.f7196c.K();
    }
}
