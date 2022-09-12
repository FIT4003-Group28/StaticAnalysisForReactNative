package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: bhx  reason: default package */
/* loaded from: classes3.dex */
final class bhx extends bhs {
    final AtomicReferenceFieldUpdater<bia, Thread> a;
    final AtomicReferenceFieldUpdater<bia, bia> b;
    final AtomicReferenceFieldUpdater<bib, bia> c;
    final AtomicReferenceFieldUpdater<bib, bhw> d;
    final AtomicReferenceFieldUpdater<bib, Object> e;

    public bhx(AtomicReferenceFieldUpdater<bia, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<bia, bia> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<bib, bia> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<bib, bhw> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<bib, Object> atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.bhs
    public final void a(bia biaVar, Thread thread) {
        this.a.lazySet(biaVar, thread);
    }

    @Override // defpackage.bhs
    public final void b(bia biaVar, bia biaVar2) {
        this.b.lazySet(biaVar, biaVar2);
    }

    @Override // defpackage.bhs
    public final boolean c(bib<?> bibVar, bia biaVar, bia biaVar2) {
        return this.c.compareAndSet(bibVar, biaVar, biaVar2);
    }

    @Override // defpackage.bhs
    public final boolean d(bib<?> bibVar, bhw bhwVar, bhw bhwVar2) {
        return this.d.compareAndSet(bibVar, bhwVar, bhwVar2);
    }

    @Override // defpackage.bhs
    public final boolean e(bib<?> bibVar, Object obj, Object obj2) {
        return this.e.compareAndSet(bibVar, obj, obj2);
    }
}
