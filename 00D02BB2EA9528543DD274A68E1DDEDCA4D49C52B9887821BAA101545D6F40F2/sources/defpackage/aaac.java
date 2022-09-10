package defpackage;
/* compiled from: PG */
/* renamed from: aaac  reason: default package */
/* loaded from: classes2.dex */
public final class aaac<T> extends btrh<T> {
    private final int d;

    public aaac(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((aaab) this.a).c = ((alhj) obj).b;
            return;
        }
        aaab aaabVar = (aaab) this.a;
        alhk alhkVar = (alhk) obj;
        if (!aaabVar.c || !aaabVar.w()) {
            return;
        }
        aaabVar.a.n(cjql.a, new cjte(deaf.LONG_PRESS), cjtd.a(dtxv.E));
        altv altvVar = alhkVar instanceof alhi ? (altv) ((alhi) alhkVar).a(altv.class) : null;
        ily ilyVar = new ily();
        ilyVar.q(alhkVar.a.S());
        ilyVar.f = false;
        ilyVar.v = dtyi.ci;
        ilyVar.g = true;
        ilyVar.b.c(altvVar);
        ilo d = ilyVar.d();
        begj begjVar = new begj();
        begjVar.b(d);
        begjVar.l = dtyi.O;
        aaabVar.b.a().o(begjVar, false, null);
    }
}
