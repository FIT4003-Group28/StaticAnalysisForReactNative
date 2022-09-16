package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7723b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7724c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u6(j6 j6Var, AtomicReference atomicReference) {
        this.f7724c = j6Var;
        this.f7723b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7723b) {
            this.f7723b.set(this.f7724c.l().j(this.f7724c.p().B()));
            this.f7723b.notify();
        }
    }
}
