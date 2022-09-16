package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzdq  reason: default package */
/* loaded from: classes6.dex */
public final class dzdq<T> extends AtomicBoolean implements dzak {
    private static final long serialVersionUID = 7514387411091976596L;
    final dzab<? super T> a;
    final dzdr<T> b;

    public dzdq(dzab<? super T> dzabVar, dzdr<T> dzdrVar) {
        this.a = dzabVar;
        this.b = dzdrVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (compareAndSet(false, true)) {
            this.b.i(this);
        }
    }
}
