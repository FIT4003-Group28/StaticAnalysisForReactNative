package defpackage;
/* compiled from: PG */
/* renamed from: phr  reason: default package */
/* loaded from: classes7.dex */
final class phr<V> extends phh<V> {
    private final phh<V> a;
    private final long b;

    public phr(phh<V> phhVar, long j) {
        this.a = phhVar;
        this.b = j;
    }

    @Override // defpackage.phh
    protected final void m(pfh<? super V> pfhVar) {
        this.a.m(new phq(pfhVar, this.b));
    }
}
