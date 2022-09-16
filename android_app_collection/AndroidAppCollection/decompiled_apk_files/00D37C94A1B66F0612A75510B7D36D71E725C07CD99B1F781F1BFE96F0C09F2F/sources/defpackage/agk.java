package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: agk  reason: default package */
/* loaded from: classes.dex */
final class agk extends agf {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public agk(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.agf
    public final void a(agn agnVar, agn agnVar2) {
        this.b.lazySet(agnVar, agnVar2);
    }

    @Override // defpackage.agf
    public final void b(agn agnVar, Thread thread) {
        this.a.lazySet(agnVar, thread);
    }

    @Override // defpackage.agf
    public final boolean c(ago agoVar, agj agjVar, agj agjVar2) {
        return this.d.compareAndSet(agoVar, agjVar, agjVar2);
    }

    @Override // defpackage.agf
    public final boolean d(ago agoVar, Object obj, Object obj2) {
        return this.e.compareAndSet(agoVar, obj, obj2);
    }

    @Override // defpackage.agf
    public final boolean e(ago agoVar, agn agnVar, agn agnVar2) {
        return this.c.compareAndSet(agoVar, agnVar, agnVar2);
    }
}
