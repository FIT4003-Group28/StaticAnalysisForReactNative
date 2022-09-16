package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7835b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7836c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z6(j6 j6Var, AtomicReference atomicReference) {
        this.f7836c = j6Var;
        this.f7835b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7835b) {
            this.f7835b.set(Long.valueOf(this.f7836c.l().a(this.f7836c.p().B(), r.M)));
            this.f7835b.notify();
        }
    }
}
