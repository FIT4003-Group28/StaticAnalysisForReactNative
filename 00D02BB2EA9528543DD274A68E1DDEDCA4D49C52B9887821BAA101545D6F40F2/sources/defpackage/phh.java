package defpackage;
/* compiled from: PG */
/* renamed from: phh  reason: default package */
/* loaded from: classes7.dex */
public abstract class phh<V> implements pfi<V> {
    @Override // defpackage.pfi
    public final pfg f(mw<? super V> mwVar) {
        return g(mwVar, phf.a);
    }

    @Override // defpackage.pfi
    public final pfg g(mw<? super V> mwVar, Runnable runnable) {
        phg phgVar = new phg(mwVar, runnable);
        m(phgVar);
        return phgVar;
    }

    @Override // defpackage.pfi
    public final void h(pfh<? super V> pfhVar) {
        m(pfhVar);
    }

    @Override // defpackage.pfi
    public final pfi<V> i(long j) {
        return new phr(this, j);
    }

    @Override // defpackage.pfi
    public final <K> pfi<V> j(dbrn<? super V, K> dbrnVar) {
        return new phj(this, dbrnVar);
    }

    @Override // defpackage.pfi
    public final <R> pfi<R> k(dbrn<? super V, ? extends R> dbrnVar) {
        return new php(this, dbrnVar);
    }

    @Override // defpackage.pfi
    public final pfi<V> l(dbsl<? super V> dbslVar) {
        return new phl(this, dbslVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void m(pfh<? super V> pfhVar);
}
