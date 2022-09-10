package defpackage;
/* compiled from: PG */
/* renamed from: dzdi  reason: default package */
/* loaded from: classes6.dex */
public final class dzdi<T, U> extends dzcw<T, U> {
    final dzba<? super T, ? extends U> b;

    public dzdi(dyzv<T> dyzvVar, dzba<? super T, ? extends U> dzbaVar) {
        super(dyzvVar);
        this.b = dzbaVar;
    }

    @Override // defpackage.dyzu
    public final void g(dyzw<? super U> dyzwVar) {
        this.a.f(new dzdh(dyzwVar, this.b));
    }
}
