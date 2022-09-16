package defpackage;
/* compiled from: PG */
/* renamed from: dzdt  reason: default package */
/* loaded from: classes6.dex */
public final class dzdt<T> extends dzaa<T> {
    final dzac<T> a;
    final dzaz<? super T> b;

    public dzdt(dzac<T> dzacVar, dzaz<? super T> dzazVar) {
        this.a = dzacVar;
        this.b = dzazVar;
    }

    @Override // defpackage.dzaa
    protected final void g(dzab<? super T> dzabVar) {
        this.a.f(new dzds(this, dzabVar));
    }
}
