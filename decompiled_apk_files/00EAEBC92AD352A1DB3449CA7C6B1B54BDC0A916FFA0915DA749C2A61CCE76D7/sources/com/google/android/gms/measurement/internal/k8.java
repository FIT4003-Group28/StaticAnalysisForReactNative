package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fa f7431b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ y7 f7432c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k8(y7 y7Var, fa faVar) {
        this.f7432c = y7Var;
        this.f7431b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7432c.f7806d;
        if (r3Var == null) {
            this.f7432c.c().s().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            r3Var.b(this.f7431b);
            this.f7432c.K();
        } catch (RemoteException e2) {
            this.f7432c.c().s().a("Failed to send measurementEnabled to the service", e2);
        }
    }
}
