package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7168b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fa f7169c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ y7 f7170d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8(y7 y7Var, AtomicReference atomicReference, fa faVar) {
        this.f7170d = y7Var;
        this.f7168b = atomicReference;
        this.f7169c = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r3 r3Var;
        synchronized (this.f7168b) {
            try {
                r3Var = this.f7170d.f7806d;
            } catch (RemoteException e2) {
                this.f7170d.c().s().a("Failed to get app instance id", e2);
                atomicReference = this.f7168b;
            }
            if (r3Var == null) {
                this.f7170d.c().s().a("Failed to get app instance id");
                this.f7168b.notify();
                return;
            }
            this.f7168b.set(r3Var.c(this.f7169c));
            String str = (String) this.f7168b.get();
            if (str != null) {
                this.f7170d.o().a(str);
                this.f7170d.k().l.a(str);
            }
            this.f7170d.K();
            atomicReference = this.f7168b;
            atomicReference.notify();
        }
    }
}
