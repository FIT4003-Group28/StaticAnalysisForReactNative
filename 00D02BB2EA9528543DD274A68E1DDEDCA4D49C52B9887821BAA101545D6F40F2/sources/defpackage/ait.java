package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: ait  reason: default package */
/* loaded from: classes2.dex */
final class ait extends aio {
    final AtomicReferenceFieldUpdater<aiw, Thread> a;
    final AtomicReferenceFieldUpdater<aiw, aiw> b;
    final AtomicReferenceFieldUpdater<aix, aiw> c;
    final AtomicReferenceFieldUpdater<aix, ais> d;
    final AtomicReferenceFieldUpdater<aix, Object> e;

    public ait(AtomicReferenceFieldUpdater<aiw, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<aiw, aiw> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<aix, aiw> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<aix, ais> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<aix, Object> atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.aio
    public final void a(aiw aiwVar, Thread thread) {
        this.a.lazySet(aiwVar, thread);
    }

    @Override // defpackage.aio
    public final void b(aiw aiwVar, aiw aiwVar2) {
        this.b.lazySet(aiwVar, aiwVar2);
    }

    @Override // defpackage.aio
    public final boolean c(aix<?> aixVar, aiw aiwVar, aiw aiwVar2) {
        return this.c.compareAndSet(aixVar, aiwVar, aiwVar2);
    }

    @Override // defpackage.aio
    public final boolean d(aix<?> aixVar, ais aisVar, ais aisVar2) {
        return this.d.compareAndSet(aixVar, aisVar, aisVar2);
    }

    @Override // defpackage.aio
    public final boolean e(aix<?> aixVar, Object obj, Object obj2) {
        return this.e.compareAndSet(aixVar, obj, obj2);
    }
}
