package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7803b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y6(j6 j6Var, AtomicReference atomicReference) {
        this.f7804c = j6Var;
        this.f7803b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7803b) {
            this.f7803b.set(Integer.valueOf(this.f7804c.l().b(this.f7804c.p().B(), r.N)));
            this.f7803b.notify();
        }
    }
}
