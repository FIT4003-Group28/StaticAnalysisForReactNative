package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: PG */
/* renamed from: dyux  reason: default package */
/* loaded from: classes6.dex */
final class dyux extends dyuw {
    private final AtomicIntegerFieldUpdater<dyuz> a;

    public dyux(AtomicIntegerFieldUpdater<dyuz> atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.dyuw
    public final boolean a(dyuz dyuzVar) {
        return this.a.compareAndSet(dyuzVar, 0, -1);
    }

    @Override // defpackage.dyuw
    public final void b(dyuz dyuzVar) {
        this.a.set(dyuzVar, 0);
    }
}
