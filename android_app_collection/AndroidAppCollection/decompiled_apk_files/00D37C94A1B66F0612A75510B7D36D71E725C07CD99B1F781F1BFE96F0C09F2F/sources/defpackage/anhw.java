package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: anhw  reason: default package */
/* loaded from: classes.dex */
final class anhw extends anhr {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public anhw(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.anhr
    public final void a(anid anidVar, anid anidVar2) {
        this.b.lazySet(anidVar, anidVar2);
    }

    @Override // defpackage.anhr
    public final void b(anid anidVar, Thread thread) {
        this.a.lazySet(anidVar, thread);
    }

    @Override // defpackage.anhr
    public final boolean c(anie anieVar, anhv anhvVar, anhv anhvVar2) {
        return this.d.compareAndSet(anieVar, anhvVar, anhvVar2);
    }

    @Override // defpackage.anhr
    public final boolean d(anie anieVar, Object obj, Object obj2) {
        return this.e.compareAndSet(anieVar, obj, obj2);
    }

    @Override // defpackage.anhr
    public final boolean e(anie anieVar, anid anidVar, anid anidVar2) {
        return this.c.compareAndSet(anieVar, anidVar, anidVar2);
    }
}
