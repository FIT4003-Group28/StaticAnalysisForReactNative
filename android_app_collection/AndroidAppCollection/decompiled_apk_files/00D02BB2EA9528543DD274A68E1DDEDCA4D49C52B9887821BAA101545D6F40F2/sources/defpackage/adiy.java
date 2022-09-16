package defpackage;
/* compiled from: PG */
/* renamed from: adiy  reason: default package */
/* loaded from: classes2.dex */
public class adiy extends aczs implements adix {
    private final abmg a;
    private final absg b;

    public adiy(abum abumVar, acwt acwtVar, abse abseVar, ilo iloVar) {
        absg b = absg.b(abseVar.b);
        this.b = b == null ? absg.UNKNOWN_EXPLORE_SURFACE : b;
        abum.a(abumVar.a.a(), 1);
        dxio a = ((dxjh) abumVar.b).a();
        abum.a(a, 2);
        abuh a2 = abumVar.c.a();
        abum.a(a2, 3);
        abum.a(((dxjh) abumVar.d).a(), 4);
        abum.a(abseVar, 7);
        abum.a(iloVar, 8);
        this.a = new abul(a, a2, acwtVar, abseVar, iloVar);
    }

    @Override // defpackage.adix
    public abmg a() {
        return this.a;
    }

    public void b(@dzsi dvhw dvhwVar) {
        abmg abmgVar = this.a;
        djrm djrmVar = null;
        if (dvhwVar != null && (dvhwVar.a & 4) != 0 && (djrmVar = dvhwVar.d) == null) {
            djrmVar = djrm.v;
        }
        abmgVar.a(djrmVar);
    }

    public boolean c() {
        return !this.a.c().isEmpty();
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return cjtd.a(this.b == absg.AREA_EXPLORE ? dtxj.cz : dtxo.cA);
    }
}
