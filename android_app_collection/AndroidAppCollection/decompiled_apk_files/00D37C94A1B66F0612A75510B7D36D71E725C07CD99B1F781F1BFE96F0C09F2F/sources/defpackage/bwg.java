package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: bwg  reason: default package */
/* loaded from: classes2.dex */
final class bwg extends bwb {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public bwg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.bwb
    public final void a(bwj bwjVar, bwj bwjVar2) {
        this.b.lazySet(bwjVar, bwjVar2);
    }

    @Override // defpackage.bwb
    public final void b(bwj bwjVar, Thread thread) {
        this.a.lazySet(bwjVar, thread);
    }

    @Override // defpackage.bwb
    public final boolean c(bwk bwkVar, bwf bwfVar, bwf bwfVar2) {
        return this.d.compareAndSet(bwkVar, bwfVar, bwfVar2);
    }

    @Override // defpackage.bwb
    public final boolean d(bwk bwkVar, Object obj, Object obj2) {
        return this.e.compareAndSet(bwkVar, obj, obj2);
    }

    @Override // defpackage.bwb
    public final boolean e(bwk bwkVar, bwj bwjVar, bwj bwjVar2) {
        return this.c.compareAndSet(bwkVar, bwjVar, bwjVar2);
    }
}
