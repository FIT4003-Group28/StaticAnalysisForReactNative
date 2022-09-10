package defpackage;
/* compiled from: PG */
/* renamed from: phl  reason: default package */
/* loaded from: classes7.dex */
final class phl<V> extends phh<V> {
    private final phh<V> a;
    private final dbsl<? super V> b;

    public phl(phh<V> phhVar, dbsl<? super V> dbslVar) {
        this.a = phhVar;
        this.b = dbslVar;
    }

    @Override // defpackage.phh
    protected final void m(pfh<? super V> pfhVar) {
        this.a.m(new phk(pfhVar, this.b));
    }
}
