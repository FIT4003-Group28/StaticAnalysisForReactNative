package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzgm  reason: default package */
/* loaded from: classes6.dex */
public final class dzgm<T> extends AtomicBoolean implements dzak {
    private static final long serialVersionUID = 3562861878281475070L;
    final dyzw<? super T> a;
    final dzgn<T> b;

    public dzgm(dyzw<? super T> dyzwVar, dzgn<T> dzgnVar) {
        this.a = dyzwVar;
        this.b = dzgnVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (compareAndSet(false, true)) {
            this.b.h(this);
        }
    }
}
