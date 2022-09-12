package defpackage;
/* compiled from: PG */
/* renamed from: phj  reason: default package */
/* loaded from: classes7.dex */
final class phj<V, K> extends phh<V> {
    private final phh<V> a;
    private final dbrn<? super V, K> b;

    public phj(phh<V> phhVar, dbrn<? super V, K> dbrnVar) {
        this.a = phhVar;
        this.b = dbrnVar;
    }

    @Override // defpackage.phh
    protected final void m(pfh<? super V> pfhVar) {
        this.a.m(new phi(pfhVar, this.b));
    }
}
