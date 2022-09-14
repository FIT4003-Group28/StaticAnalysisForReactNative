package defpackage;
/* compiled from: PG */
/* renamed from: cifd  reason: default package */
/* loaded from: classes4.dex */
public final class cifd {
    public final ciem a;
    public final ciff b;
    public final cifh c;

    public cifd(ciem ciemVar, ciff ciffVar, cifh cifhVar) {
        this.a = ciemVar;
        this.b = ciffVar;
        this.c = cifhVar;
    }

    public static dqgh a(chxk chxkVar) {
        chwf chwfVar;
        if (chxkVar.b == 20) {
            chwfVar = (chwf) chxkVar.c;
        } else {
            chwfVar = chwf.c;
        }
        dnjp dnjpVar = chwfVar.b;
        if (dnjpVar == null) {
            dnjpVar = dnjp.b;
        }
        dnvs dnvsVar = dnjpVar.a;
        if (dnvsVar == null) {
            dnvsVar = dnvs.d;
        }
        dqgh b = dqgh.b(dnvsVar.b.get(0).b);
        return b == null ? dqgh.UNDEFINED : b;
    }
}
