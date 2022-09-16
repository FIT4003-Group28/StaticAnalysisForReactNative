package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7554b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7555c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6(j6 j6Var, AtomicReference atomicReference) {
        this.f7555c = j6Var;
        this.f7554b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7554b) {
            this.f7554b.set(Boolean.valueOf(this.f7555c.l().i(this.f7555c.p().B())));
            this.f7554b.notify();
        }
    }
}
