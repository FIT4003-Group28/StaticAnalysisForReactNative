package defpackage;
/* compiled from: PG */
/* renamed from: dzdv  reason: default package */
/* loaded from: classes6.dex */
public final class dzdv<T> extends dzaa<T> {
    final dzac<? extends T> a;
    final dzba<? super Throwable, ? extends T> b;

    public dzdv(dzac<? extends T> dzacVar, dzba<? super Throwable, ? extends T> dzbaVar) {
        this.a = dzacVar;
        this.b = dzbaVar;
    }

    @Override // defpackage.dzaa
    protected final void g(dzab<? super T> dzabVar) {
        this.a.f(new dzdu(this, dzabVar));
    }
}
