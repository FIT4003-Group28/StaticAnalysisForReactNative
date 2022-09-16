package defpackage;
/* compiled from: PG */
/* renamed from: els  reason: default package */
/* loaded from: classes6.dex */
final class els<T> implements dzsj<T> {
    final /* synthetic */ elt a;
    private final int b;

    public els(elt eltVar, int i) {
        this.a = eltVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            elt eltVar = this.a;
            return (T) new sbm(eltVar.a.eW.m(), eltVar.a.eW.il(), eltVar.a.eS(), eltVar.a.hb());
        } else if (i != 1) {
            return (T) new sei(this.a.a.eW.m());
        } else {
            elt eltVar2 = this.a;
            return (T) new sev(eltVar2.a.eW.m(), eltVar2.a.eW.al(), eltVar2.a.eW.K());
        }
    }
}
