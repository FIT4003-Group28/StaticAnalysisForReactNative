package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7193b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7194c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b7(j6 j6Var, AtomicReference atomicReference) {
        this.f7194c = j6Var;
        this.f7193b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7193b) {
            this.f7193b.set(Double.valueOf(this.f7194c.l().c(this.f7194c.p().B(), r.O)));
            this.f7193b.notify();
        }
    }
}
