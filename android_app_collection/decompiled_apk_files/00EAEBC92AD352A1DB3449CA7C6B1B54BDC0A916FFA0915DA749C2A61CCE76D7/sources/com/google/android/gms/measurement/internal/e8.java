package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f7275b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fa f7276c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ y7 f7277d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8(y7 y7Var, Bundle bundle, fa faVar) {
        this.f7277d = y7Var;
        this.f7275b = bundle;
        this.f7276c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        r3Var = this.f7277d.f7806d;
        if (r3Var == null) {
            this.f7277d.c().s().a("Failed to send default event parameters to service");
            return;
        }
        try {
            r3Var.a(this.f7275b, this.f7276c);
        } catch (RemoteException e2) {
            this.f7277d.c().s().a("Failed to send default event parameters to service", e2);
        }
    }
}
