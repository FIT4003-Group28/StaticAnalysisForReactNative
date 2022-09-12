package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzbg  reason: default package */
/* loaded from: classes6.dex */
public final class dzbg extends AtomicReference<dzak> implements dzak {
    private static final long serialVersionUID = -754898800686245608L;

    public dzbg() {
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
    }

    public final boolean b() {
        return get() == dzbd.a;
    }

    public dzbg(dzak dzakVar) {
        lazySet(dzakVar);
    }
}
