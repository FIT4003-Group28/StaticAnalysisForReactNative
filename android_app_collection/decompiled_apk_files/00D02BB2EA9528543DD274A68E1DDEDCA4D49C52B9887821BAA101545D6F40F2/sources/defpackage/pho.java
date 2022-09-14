package defpackage;
/* compiled from: PG */
/* renamed from: pho  reason: default package */
/* loaded from: classes7.dex */
final class pho<V, R> implements pfh<V> {
    private final pfh<? super R> a;
    private final dbrn<? super V, ? extends R> b;
    @dzsi
    private pfg c;

    public pho(pfh<? super R> pfhVar, dbrn<? super V, ? extends R> dbrnVar) {
        this.a = pfhVar;
        this.b = dbrnVar;
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
        this.c = pfgVar;
        this.a.c(pfgVar);
    }

    @Override // defpackage.pfh
    public final void d(V v) {
        this.a.d((R) this.b.a(v));
    }

    @Override // defpackage.pfh
    public final void e() {
        pfg pfgVar = this.c;
        if (pfgVar != null) {
            pfgVar.a();
        }
        this.a.e();
    }
}
