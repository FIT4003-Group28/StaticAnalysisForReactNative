package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: defc  reason: default package */
/* loaded from: classes.dex */
final class defc extends defb {
    final AtomicReferenceFieldUpdater<defe, Set<Throwable>> a;
    final AtomicIntegerFieldUpdater<defe> b;

    public defc(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.defb
    public final int a(defe defeVar) {
        return this.b.decrementAndGet(defeVar);
    }

    @Override // defpackage.defb
    public final void b(defe defeVar, Set<Throwable> set) {
        this.a.compareAndSet(defeVar, null, set);
    }
}
