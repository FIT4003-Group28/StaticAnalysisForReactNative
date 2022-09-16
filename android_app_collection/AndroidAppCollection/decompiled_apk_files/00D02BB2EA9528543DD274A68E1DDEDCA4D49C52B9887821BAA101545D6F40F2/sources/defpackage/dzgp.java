package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzgp  reason: default package */
/* loaded from: classes6.dex */
public final class dzgp<T> extends AtomicReference<dzgq<T>> implements dzak {
    private static final long serialVersionUID = -7650903191002190468L;
    final dzab<? super T> a;

    public dzgp(dzab<? super T> dzabVar, dzgq<T> dzgqVar) {
        this.a = dzabVar;
        lazySet(dzgqVar);
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzgq<T> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.j(this);
        }
    }
}
