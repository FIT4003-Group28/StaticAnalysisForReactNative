package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzgk  reason: default package */
/* loaded from: classes6.dex */
public final class dzgk extends AtomicReference<dzgl> implements dzak {
    private static final long serialVersionUID = -7650903191002190468L;
    final dyzq a;

    public dzgk(dyzq dyzqVar, dzgl dzglVar) {
        this.a = dyzqVar;
        lazySet(dzglVar);
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzgl andSet = getAndSet(null);
        if (andSet != null) {
            andSet.i(this);
        }
    }
}
