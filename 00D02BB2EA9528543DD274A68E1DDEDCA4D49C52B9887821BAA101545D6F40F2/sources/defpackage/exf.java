package defpackage;
/* compiled from: PG */
/* renamed from: exf  reason: default package */
/* loaded from: classes6.dex */
final class exf<T> implements dzsj<T> {
    final /* synthetic */ exg a;
    private final int b;

    public exf(exg exgVar, int i) {
        this.a = exgVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) axzf.b(this.a.a.eW.fn());
        }
        caxo ff = this.a.a.ff();
        caxa caxaVar = caxa.LISTS;
        dxjg.f(caxaVar);
        return (T) caxg.b(ff, caxaVar);
    }
}
