package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: phb  reason: default package */
/* loaded from: classes7.dex */
final class phb<V> implements pfg, crzp {
    private final AtomicBoolean a = new AtomicBoolean();
    private final pfh<? super pfo<V>> b;
    private final crzm<pfo<V>> c;

    public phb(pfh<? super pfo<V>> pfhVar, crzm<pfo<V>> crzmVar) {
        this.b = pfhVar;
        this.c = crzmVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<pfo<V>> crzmVar) {
        pfo<V> l = crzmVar.l();
        dbsk.t(l, "Null signal propagated from ObservableState.");
        if (!this.a.get()) {
            this.b.d(l);
        }
    }

    @Override // defpackage.pfg
    public final void a() {
        if (this.a.compareAndSet(false, true)) {
            this.c.c(this);
            this.c.f();
        }
    }

    @Override // defpackage.pfg
    public final boolean b() {
        return this.a.get();
    }
}
