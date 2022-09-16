package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: PG */
/* renamed from: aylz  reason: default package */
/* loaded from: classes2.dex */
final class aylz extends ayly {
    private final AtomicIntegerFieldUpdater a;

    public aylz(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.ayly
    public final boolean a(aymb aymbVar) {
        return this.a.compareAndSet(aymbVar, 0, -1);
    }

    @Override // defpackage.ayly
    public final void b(aymb aymbVar) {
        this.a.set(aymbVar, 0);
    }
}
