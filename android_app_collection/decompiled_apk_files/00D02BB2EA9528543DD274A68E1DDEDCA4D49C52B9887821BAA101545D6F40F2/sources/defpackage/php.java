package defpackage;
/* compiled from: PG */
/* renamed from: php  reason: default package */
/* loaded from: classes7.dex */
final class php<V, R> extends phh<R> {
    private final phh<V> a;
    private final dbrn<? super V, ? extends R> b;

    public php(phh<V> phhVar, dbrn<? super V, ? extends R> dbrnVar) {
        this.a = phhVar;
        this.b = dbrnVar;
    }

    @Override // defpackage.phh
    protected final void m(pfh<? super R> pfhVar) {
        this.a.m(new pho(pfhVar, this.b));
    }
}
