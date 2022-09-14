package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: deek  reason: default package */
/* loaded from: classes6.dex */
final class deek extends deef {
    final AtomicReferenceFieldUpdater<deer, Thread> a;
    final AtomicReferenceFieldUpdater<deer, deer> b;
    final AtomicReferenceFieldUpdater<dees, deer> c;
    final AtomicReferenceFieldUpdater<dees, deej> d;
    final AtomicReferenceFieldUpdater<dees, Object> e;

    public deek(AtomicReferenceFieldUpdater<deer, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<deer, deer> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<dees, deer> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<dees, deej> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<dees, Object> atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.deef
    public final void a(deer deerVar, Thread thread) {
        this.a.lazySet(deerVar, thread);
    }

    @Override // defpackage.deef
    public final void b(deer deerVar, deer deerVar2) {
        this.b.lazySet(deerVar, deerVar2);
    }

    @Override // defpackage.deef
    public final boolean c(dees<?> deesVar, deer deerVar, deer deerVar2) {
        return this.c.compareAndSet(deesVar, deerVar, deerVar2);
    }

    @Override // defpackage.deef
    public final boolean d(dees<?> deesVar, deej deejVar, deej deejVar2) {
        return this.d.compareAndSet(deesVar, deejVar, deejVar2);
    }

    @Override // defpackage.deef
    public final boolean e(dees<?> deesVar, Object obj, Object obj2) {
        return this.e.compareAndSet(deesVar, obj, obj2);
    }
}
