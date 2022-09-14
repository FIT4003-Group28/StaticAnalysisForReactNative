package defpackage;
/* compiled from: PG */
/* renamed from: phk  reason: default package */
/* loaded from: classes7.dex */
final class phk<V> implements pfh<V> {
    private final pfh<? super V> a;
    private final dbsl<? super V> b;
    @dzsi
    private pfg c;

    public phk(pfh<? super V> pfhVar, dbsl<? super V> dbslVar) {
        this.a = pfhVar;
        this.b = dbslVar;
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
        this.c = pfgVar;
        this.a.c(pfgVar);
    }

    @Override // defpackage.pfh
    public final void d(V v) {
        if (this.b.a(v)) {
            this.a.d(v);
        }
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
