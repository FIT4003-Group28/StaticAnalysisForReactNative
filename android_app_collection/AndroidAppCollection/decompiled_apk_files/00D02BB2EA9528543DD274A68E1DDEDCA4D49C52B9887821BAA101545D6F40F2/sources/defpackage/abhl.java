package defpackage;
/* compiled from: PG */
/* renamed from: abhl  reason: default package */
/* loaded from: classes2.dex */
public class abhl {
    private static final absg k = absg.AREA_EXPLORE;
    public final abil a;
    public final abfa b;
    public final acyr c;
    public final adfg d;
    public final adgw e;
    public final adca f;
    public final adkd g;
    public final adit h;
    public final dxio<adeo> i;
    public ilo j;

    public abhl(abim abimVar, abfa abfaVar, acyr acyrVar, adfg adfgVar, adgw adgwVar, adca adcaVar, adkd adkdVar, adit aditVar, dxio<adeo> dxioVar) {
        this.d = adfgVar;
        this.e = adgwVar;
        this.b = abfaVar;
        this.c = acyrVar;
        this.f = adcaVar;
        this.g = adkdVar;
        this.h = aditVar;
        this.a = abimVar.a(k);
        this.i = dxioVar;
    }

    public final abse a() {
        absd bZ = abse.e.bZ();
        absg absgVar = absg.AREA_EXPLORE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        abse abseVar = (abse) bZ.b;
        abseVar.b = absgVar.d;
        abseVar.a |= 1;
        ilo iloVar = this.j;
        if (iloVar != null) {
            if (iloVar.ak() != null) {
                dhjx ak = this.j.ak();
                dbsk.s(ak);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                abse abseVar2 = (abse) bZ.b;
                ak.getClass();
                abseVar2.c = ak;
                abseVar2.a |= 2;
            }
            if (this.j.ai() != null && !this.j.ai().equals(akqi.a)) {
                String o = this.j.ai().o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                abse abseVar3 = (abse) bZ.b;
                o.getClass();
                abseVar3.a |= 4;
                abseVar3.d = o;
            }
        }
        return bZ.bK();
    }
}
