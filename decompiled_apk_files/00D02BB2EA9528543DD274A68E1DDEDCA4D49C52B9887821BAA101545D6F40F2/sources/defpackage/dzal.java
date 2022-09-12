package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzal  reason: default package */
/* loaded from: classes6.dex */
abstract class dzal<T> extends AtomicReference<T> implements dzak {
    private static final long serialVersionUID = 6537757548749041217L;

    public dzal(T t) {
        super(t);
    }

    @Override // defpackage.dzak
    public final void SQ() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        b(andSet);
    }

    protected abstract void b(T t);
}
