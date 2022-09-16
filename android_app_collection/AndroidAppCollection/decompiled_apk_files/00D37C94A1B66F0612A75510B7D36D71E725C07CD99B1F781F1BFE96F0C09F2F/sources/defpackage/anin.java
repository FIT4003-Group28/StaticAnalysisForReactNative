package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: anin  reason: default package */
/* loaded from: classes.dex */
final class anin extends anim {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public anin(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.anim
    public final int a(anip anipVar) {
        return this.b.decrementAndGet(anipVar);
    }

    @Override // defpackage.anim
    public final void b(anip anipVar, Set set) {
        this.a.compareAndSet(anipVar, null, set);
    }
}
